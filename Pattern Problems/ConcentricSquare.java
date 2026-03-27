public class ConcentricSquare {

    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        // loop for rows
        for (int i = 0; i < size; i++) {

            // loop for columns
            for (int j = 0; j < size; j++) {

                int start = 0;
                int end = size - 1;
                int value = n;

                // find which layer (start/end) the cell belongs to
                while (true) {

                    if (i == start || i == end || j == start || j == end) {
                        System.out.print(value + " ");
                        break;
                    }

                    // move to inner layer
                    start++;
                    end--;
                    value--;
                }
            }

            System.out.println();
        }
    }
}
