//only for aplphabets from a to z only 
public class RemoveDuplicatesRecurion {

  static void removeDuplicates(String str, int index, StringBuilder result, boolean[] map) {
    if (index == str.length()) {
      System.out.println(result);
      return;
    }

    char currChar = str.charAt(index);

    // suppose currChar is 'c' if we do only map[currChar] then it will be like
    // map[99] but we onlu consider 26
    // we do c-a which gives 99-97 = 2 then map[2] = true like this
    if (map[currChar - 'a'] == true) {
      removeDuplicates(str, index + 1, result, map);// skip character if already present
    } else {// new character
      map[currChar - 'a'] = true;
      removeDuplicates(str, index + 1, result.append(currChar), map);// we append new character to our result
    }
  }

  public static void main(String[] args) {
    String str = "appannacollege";
    StringBuilder result = new StringBuilder("");
    boolean[] map = new boolean[26];
    removeDuplicates(str, 0, result, map);

  }
}


/*
✅ Algorithm: Remove Duplicate Characters Using Recursion
Input:

A string str

Output:

A string without duplicate characters (first occurrence only)

Steps (Algorithm):

Start.

Read the input string str.

Create a boolean array map[26] to store visited characters.

Call function
removeDuplicates(str, 0, emptyStringBuilder, map).

In the function:

If idx == length of string:

Print newStr.

Stop recursion.

Get current character:

currChar = str.charAt(idx)


Convert character to index:

pos = currChar - 'a'


If map[pos] == true:

Character is duplicate.

Call function for next index.

Else:

Mark map[pos] = true

Append character to newStr

Call function for next index.

Repeat steps until end of string.

Stop.

✅ Program Information
📌 Technique Used:

Recursion

Boolean array (hashing technique)

StringBuilder

📌 Type:

Duplicate removal

String processing

Backtracking-style recursion


✅ Time Complexity
⏱ Time = O(n)

Where n = length of string

Reason:

Each character is visited once.

Boolean check is constant time.

👉 So total time = n × O(1) = O(n)

✅ Space Complexity
💾 Space = O(n)
Reason:

Recursion stack → O(n)

StringBuilder → O(n)

Boolean array → O(26) ≈ O(1)

Total:

O(n) + O(n) + O(1) = O(n)

✅ Memory Used
Component	Space
Call Stack	O(n)
Result String	O(n)
Boolean Map	O(1)
✅ Why Boolean Array Is Used?

To remember which characters are already used.

Example:

map[0] → 'a'
map[1] → 'b'


If map[i] == true → character is duplicate.

✅ Limitations

❌ Works only for lowercase letters (a–z)
❌ Stack overflow if string is very large
❌ Not suitable for Unicode characters

*/