/*
Perfect 👍 — Queue Reversal is a core Queue + Stack question.
I’ll explain it cleanly, step-by-step, then give you the standard solution and alternatives, and finally tell you what interview expects.

✅ Question 6: Queue Reversal
📌 Problem

Reverse a queue.

Input
1 2 3 4 5
Output
5 4 3 2 1
🧠 Key Insight (VERY IMPORTANT)

A queue is FIFO, so you cannot reverse it using only queue operations.

👉 You need Stack (LIFO) to reverse the order.

This is why this problem is asked — to test DS understanding.

🚌 Real-Life Analogy

Think of people standing in a line 🎟️:

Queue = first comes out first
Stack = last comes out first

To reverse the line:

Make everyone climb stairs (stack)
Bring them back down → reversed order
✅ Standard & MOST ACCEPTED Approach
(Queue + Stack) ⭐

This is the standard interview answer.

🔹 Algorithm (Exam-Ready)

1️⃣ Create a stack
2️⃣ Remove all elements from queue → push into stack
3️⃣ Pop all elements from stack → add back to queue

Because stack reverses order automatically.
*/
import java.util.*;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {

        Stack<Integer> st = new Stack<>();

        // Step 1: Move queue elements to stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        // Step 2: Move stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
/*


🔄 Step-by-Step Example
Initial Queue
1 2 3 4 5
After pushing into stack
Stack (top): 5 4 3 2 1
Queue: empty
After popping back
Queue: 5 4 3 2 1

✔️ Reversed successfully.

📊 Time & Space Complexity
Metric	Value
Time	O(n)
Extra Space	O(n) (stack)
⚠️ Edge Cases (Exam Points)

✔️ Empty queue → remains empty
✔️ One element → same queue
✔️ Works for any data type

❓ Can We Do It Without Stack?
👉 Yes, using Recursion (advanced)

But:

Uses call stack internally
Less preferred in interviews
Recursive Version (Optional)
public static void reverse(Queue<Integer> q) {

    if (q.isEmpty()) {
        return;
    }

    int front = q.remove();
    reverse(q);
    q.add(front);
}

⚠️ Interviewers usually prefer stack version.

❓ Can We Use ArrayDeque?

👉 Yes ✔️
Use ArrayDeque as stack + queue — fastest in real projects.

🎯 Interview Questions They Ask Here
❓ Why stack is needed?

👉 Because queue alone cannot reverse order.

❓ Can queue reverse itself?

👉 ❌ No (FIFO restriction).

❓ Best approach?

👉 Stack + Queue.

❓ Time complexity?

👉 O(n).

✅ Final Verdict (Remember This)

✔️ Stack + Queue = STANDARD METHOD ⭐
✔️ Most asked in exams & interviews
✔️ Simple and clean
✔️ Shows DS understanding
*/