public class RemoveDuplicatesRecurion2 {

  static void removeDuplicates(String str, int index, StringBuilder result, boolean[] map) {
    if (index == str.length()) {
      System.out.println(result);
      return;
    }

    char currChar = str.charAt(index);

    
    if (map[currChar] == true) {
      removeDuplicates(str, index + 1, result, map);// skip character if already present
    } else {// new character
      map[currChar] = true;
      removeDuplicates(str, index + 1, result.append(currChar), map);// we append new character to our result
    }
  }

  public static void main(String[] args) {
    String str = "appannacollege";
    StringBuilder result = new StringBuilder("");
    boolean[] map = new boolean[256];
    removeDuplicates(str, 0, result, map);

  }
}
/*
✅ Algorithm (Recursive + 256 Method)

Start.

Read input string str.

Create boolean array visited[256].

Call function:

removeDuplicates(str, 0, emptyStringBuilder, visited)


In function:

If idx == length of string:

Print result.

Return.

Get current character:

ch = str.charAt(idx)


Convert character to index:

index = (int) ch


If visited[index] == true:

Skip character.

Call function for next index.

Else:

Mark visited.

Append character.

Call function for next index.

Repeat until end.

Stop.


✅ Time Complexity

⏱ O(n)
Each character processed once.

✅ Space Complexity

💾 O(n)

Because:

Recursion stack → O(n)

StringBuilder → O(n)

Boolean array → O(1)

✅ Why Use boolean[256] in Recursion?

Because:

✔ Faster than HashSet
✔ Supports all ASCII
✔ No hashing overhead
✔ Simple indexing

✅ Comparison (Recursive Versions)
Method	Characters	Speed	Stack Risk
boolean[26]	a–z only	Fast	Yes
boolean[256]	ASCII	Faster	Yes
HashSet	Unicode	Slower	No

✅ Important Viva / Interview Questions
Q1: Is char signed or unsigned?

👉 Unsigned (0–65535)

Q2: Size of char in Java?

👉 2 bytes

Q3: Does Java use ASCII?

👉 No, Unicode

Q4: Why emoji length is 2?

👉 Surrogate pairs

Q5: Can char store all emojis?

👉 ❌ No (needs 2 chars)
*/