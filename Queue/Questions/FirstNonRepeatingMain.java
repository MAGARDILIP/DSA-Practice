/*
✅ Problem: First Non-Repeating Character in a Stream
📌 Meaning

You are given characters one by one (stream).

After each character arrives, you must tell:

👉 What is the first character till now that has appeared only once.

If no such character → print -1.

📥 Example

Input stream:

a a b c c x b

We process one by one.

🧠 Idea (Very Important)

We use 2 things:

1️⃣ Frequency Array / Map → to count characters
2️⃣ Queue → to keep order

Why?

👉 Queue keeps order
👉 Map keeps count

Together → solve problem.

🚌 Real-Life Analogy

Think of people entering a line 🎟️

Count how many times each person comes
Keep them in line
Remove repeated ones

Front of line = answer ✔️

✅ Step-by-Step Working

Let’s solve:

a a b c c x b
Initialize
freq[ ] = 0
queue = empty
1️⃣ Read: a
freq[a] = 1
queue = [a]

Front = a → Answer = a ✅

2️⃣ Read: a
freq[a] = 2
queue = [a, a]

Now:

a is repeated ❌
remove from front

Queue becomes:

[]

Answer = -1 ❌

3️⃣ Read: b
freq[b] = 1
queue = [b]

Answer = b ✅

4️⃣ Read: c
freq[c] = 1
queue = [b, c]

b still unique → Answer = b ✅

5️⃣ Read: c
freq[c] = 2
queue = [b, c, c]

b still freq=1 → Answer = b ✅

6️⃣ Read: x
freq[x] = 1
queue = [b, c, c, x]

b still unique → Answer = b ✅

7️⃣ Read: b
freq[b] = 2
queue = [b, c, c, x, b]

Now:

b repeated ❌ → remove
c repeated ❌ → remove
x unique ✅

Answer = x

✅ Final Output
a -1 b b b b x
📌 Algorithm (Exam Format)

1️⃣ Create freq array of size 26
2️⃣ Create Queue<Character>
3️⃣ For each character ch:

freq[ch]++
add ch to queue
while queue not empty AND freq[front] > 1
→ remove front
if queue empty → print -1
else → print front
*/
import java.util.*;

class FirstNonRepeatingMain {

    public static void main(String args[]) {

        String str = "aabc cxb".replace(" ", "");

        int freq[] = new int[26];

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Increase frequency
            freq[ch - 'a']++;

            // Add to queue
            q.add(ch);

            // Remove repeated characters
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print answer
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}
