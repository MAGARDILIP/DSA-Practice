/*
✅ PART 2: Interleave Queue When Length is ODD (Important Variant)

Earlier problem:

Interleave 2 halves of queue (even length)

Now:

❓ What if length is ODD?

Example:

1 2 3 4 5 6 7

Size = 7 (odd)

📌 Rule (Very Important)

👉 Middle element stays at end (or middle)
👉 Remaining elements are interleaved

📥 Input
1 2 3 4 5 6 7

Split:

First = 1 2 3
Middle = 4
Second = 5 6 7

Interleave:

1 5 2 6 3 7 4

✔️ Middle goes last.

🧠 Logic

1️⃣ Remove first half → stack
2️⃣ Keep middle aside
3️⃣ Interleave rest
4️⃣ Add middle at end
*/


import java.util.*;

class InterLeaveOddQueueMain {

    public static void interleave(Queue<Integer> q) {

        int n = q.size();

        if (n < 2) return;

        Stack<Integer> st = new Stack<>();

        int half = n / 2;

        // Step 1: Push first half
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 2: Store middle (only if odd)
        int middle = -1;

        if (n % 2 == 1) {
            middle = q.remove();
        }

        // Step 3: Put stack back
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 4: Rotate
        for (int i = 0; i < half; i++) {
            q.add(q.remove());
        }

        // Step 5: Push first half again
        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        // Step 6: Interleave
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // Step 7: Add middle at end
        if (n % 2 == 1) {
            q.add(middle);
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 7; i++) {
            q.add(i);
        }

        interleave(q);

        System.out.println(q); // [1,5,2,6,3,7,4]
    }
}

/*
📊 Time & Space Complexity
Problem	Time	Space
Reverse (Deque)	O(n)	O(n)
Interleave Odd	O(n)	O(n)
⚠️ Edge Cases (Exam Important)
Queue Reversal

✔️ Empty → same
✔️ One element → same

Odd Interleave

✔️ Size = 1 → no change
✔️ Size = 3 → works
✔️ Size = 5,7,9 → works

🎯 Interview Questions
❓ Why use ArrayDeque instead of Stack?

👉 Faster, modern, no synchronization

❓ What happens to middle in odd case?

👉 Kept separate, added at end

❓ Can odd case be done without extra space?

👉 ❌ Not cleanly

✅ Final Summary (Remember This)
Queue Reverse (Best Way)

👉 ArrayDeque as stack ⭐

Interleave Odd Length

👉 Remove middle → interleave → add back ✔️
*/