class Solution {
    /**
     * Finds the repeating (a) and missing (b) numbers using the mathematical Sum and Sum of Squares method.
     * Time Complexity: O(n^2) = O(N)
     * Space Complexity: O(1) auxiliary space (optimal space)
     *
     * @param grid The n*n 2D integer matrix.
     * @return A 0-indexed array [a, b] where 'a' is the repeating number and 'b' is the missing number.
     */
    public int[] findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        // Total number of elements, N = n * n
        long N = (long)n * n; 
        
        // Use 'long' for all sums and differences to prevent integer overflow.
        
        // --- 1. Calculate Expected Sums ---
        
        // Expected Sum (S1_expected) of {1, 2, ..., N} using the formula: N * (N + 1) / 2
        long S1_expected = N * (N + 1) / 2; 
        
        // Expected Sum of Squares (S2_expected) of {1^2, 2^2, ..., N^2} 
        // Formula: N * (N + 1) * (2N + 1) / 6
        long S2_expected = N * (N + 1) * (2 * N + 1) / 6; 
        
        // --- 2. Calculate Actual Sums (O(N) loop) ---
        long S1_actual = 0; 
        long S2_actual = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long current = grid[i][j];
                
                S1_actual += current;
                S2_actual += current * current; 
            }
        }
        
        // --- 3. Derive and Solve the System of Equations ---
        
        /*
         * DERIVATION STEP 1: Find the difference of sums (a - b)
         * * The actual sum (S1_actual) has the missing number 'b' removed and the 
         * repeating number 'a' added once extra.
         * * S1_actual = S1_expected - b + a
         * S1_actual - S1_expected = a - b
         */
        // Diff1: Represents (a - b)
        long Diff1 = S1_actual - S1_expected;
        
        
        /*
         * DERIVATION STEP 2: Find the difference of squares (a^2 - b^2)
         * * Similarly, for the sum of squares:
         * S2_actual = S2_expected - b^2 + a^2
         * S2_actual - S2_expected = a^2 - b^2
         */
        // Diff2: Represents (a^2 - b^2)
        long Diff2 = S2_actual - S2_expected;
        
        
        /*
         * DERIVATION STEP 3: Find the sum of the numbers (a + b)
         * * We use the difference of squares identity: a^2 - b^2 = (a - b) * (a + b)
         * Substitute Diff2 for (a^2 - b^2) and Diff1 for (a - b):
         * Diff2 = Diff1 * (a + b)
         * a + b = Diff2 / Diff1
         */
        // Sum_a_b: Represents (a + b)
        // Note: Diff2 is guaranteed to be perfectly divisible by Diff1.
        long Sum_a_b = Diff2 / Diff1;
        
        
        /*
         * DERIVATION STEP 4: Solve the final linear system
         * * We now have two simple linear equations:
         * (I)   a - b = Diff1
         * (II)  a + b = Sum_a_b
         */
        
        // Find 'a' (Repeating Number): Add (I) and (II):
        // (a - b) + (a + b) = Diff1 + Sum_a_b  =>  2a = Diff1 + Sum_a_b
        // a = (Sum_a_b + Diff1) / 2
        long repeatingNum = (Sum_a_b + Diff1) / 2;
        
        // Find 'b' (Missing Number): Subtract (I) from (II):
        // (a + b) - (a - b) = Sum_a_b - Diff1  =>  2b = Sum_a_b - Diff1
        // b = (Sum_a_b - Diff1) / 2
        long missingNum = (Sum_a_b - Diff1) / 2;
        
        
        // --- 4. Return the result ---
        return new int[]{(int)repeatingNum, (int)missingNum};
    }
}