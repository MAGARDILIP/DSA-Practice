/*
✅ PART 1: Queue Reversal Using ArrayDeque Only (Best Real-World Way) ⭐

In real projects, developers don’t use Stack class (it’s old & slow).
They use ArrayDeque as Stack + Queue.

👉 Same DS does both jobs.

🧠 Idea

Use ArrayDeque as:

Stack → push(), pop()
Queue → add(), remove()

So no extra Stack class needed.
*/
import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueueUsingArrayDeque {
      public static void reverse(Queue<Integer> q) {

        // Use ArrayDeque as Stack
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Step 1: Queue -> Deque (as stack)
        while (!q.isEmpty()) {
            dq.push(q.remove()); // push = stack push
        }

        // Step 2: Deque -> Queue
        while (!dq.isEmpty()) {
            q.add(dq.pop()); // pop = stack pop
        }
      }

        public static void main(String[] args) {
            Queue<Integer> q = new ArrayDeque<>();

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
