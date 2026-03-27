/*
✅ Question: Interleave 2 Halves of a Queue (Even Length)
📌 Problem Meaning

You are given a queue of even length.

You must interleave the first half with the second half.

📥 Input
Queue = 1 2 3 4 5 6 7 8 9 10

First half:

1 2 3 4 5

Second half:

6 7 8 9 10
📤 Output
1 6 2 7 3 8 4 9 5 10

👉 Take one from first half, then one from second half, alternately.

🧠 Key Insight (Very Important)

Queue alone cannot help because:

You can only remove from front
But you need controlled access to halves

👉 So we use Stack + Queue

🚌 Real-World Analogy

Imagine two queues of people:

Queue A: Boys
Queue B: Girls

Final line should be:

Boy1, Girl1, Boy2, Girl2, ...

That’s interleaving.

✅ Standard Algorithm (Apna College / Interview Style)
We use:
One Stack
Same Queue
🔹 Step-by-Step Algorithm
Step 1️⃣: Push first half into stack
Queue: 1 2 3 4 5 6 7 8 9 10
Stack: 1 2 3 4 5   (top = 5)
Queue: 6 7 8 9 10
Step 2️⃣: Push stack back into queue

(stack reverses order)

Queue: 6 7 8 9 10 5 4 3 2 1
Step 3️⃣: Move first half back to rear
Queue: 5 4 3 2 1 6 7 8 9 10
Step 4️⃣: Again push first half into stack
Stack: 5 4 3 2 1
Queue: 6 7 8 9 10
Step 5️⃣: Interleave

Take:

one from stack
one from queue

Final:

1 6 2 7 3 8 4 9 5 10

🎉 Done!

📊 Time & Space Complexity
Metric	Value
Time	O(n)
Extra Space	O(n) (stack)
⚠️ Edge Cases (Exam-worthy)

1️⃣ Odd length queue ❌ (not allowed)
2️⃣ Empty queue
3️⃣ Only 2 elements → already interleaved

🎯 Interview Questions You’ll Get
❓ Why stack is used?

👉 To reverse first half

❓ Can this be done without stack?

👉 ❌ Not cleanly with queue alone

❓ Can ArrayDeque be used?

👉 ✅ Yes (as stack + queue)

❓ Where is this used?

👉 Scheduling, buffering, rearranging streams
*/

import java.util.*;

class InterleaveQueue {

    public static void interleave(Queue<Integer> q) {

        int n = q.size();

        // Step 0: check even length
        if (n % 2 != 0) {
            System.out.println("Queue length must be even");
            return;
        }

        Stack<Integer> st = new Stack<>();

        // Step 1: push first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 2: push stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: move first half to back
        for (int i = 0; i < n / 2; i++) {
            q.add(q.remove());
        }

        // Step 4: again push first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 5: interleave
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
    }

}

public class InterLeaveEvenQueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Original Queue: " + q); // [1, 2, 3, 4, 5, 6]

        InterleaveQueue.interleave(q);

        System.out.println("Interleaved Queue: " + q); // [1, 4, 2, 5, 3, 6]
    }
}