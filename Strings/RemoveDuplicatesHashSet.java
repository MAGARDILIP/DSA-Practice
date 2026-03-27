import java.util.HashSet;

public class RemoveDuplicatesHashSet {
  public static void main(String[] args){
    String str="appannacollege";
    StringBuilder result = new StringBuilder("");

    HashSet<Character> set = new HashSet<>();

    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(!set.contains(ch)){
        set.add(ch);
        result.append(ch);
      }
    }

    System.out.println(result);
  }
}

/*
Input:

A string str

Output:

A string without duplicate characters (first occurrence only)

📌 Steps (Algorithm):

Start.

Read the input string str.

Create an empty HashSet<Character> to store visited characters.

Create an empty StringBuilder result.

Traverse the string using a loop from i = 0 to length-1.

For each character ch:

If ch is NOT present in HashSet:

Add ch to HashSet.

Append ch to result.

Else:

Skip the character.

After loop ends, print result.

Stop.


📌 Technique Used:

Iteration (Loop)

HashSet (Collection Framework)

StringBuilder

📌 Type:

Duplicate removal

String processing

Hash-based approach

✅ Time Complexity
⏱ Time = O(n)

Where n = length of string

Reason:

Loop runs n times

HashSet operations are O(1)

👉 Total = O(n)

✅ Space Complexity
💾 Space = O(n)
Reason:

HashSet stores unique characters → O(n)

StringBuilder stores result → O(n)

Total:

O(n)

✅ Memory Used
Component	Space
HashSet	O(n)
Result String	O(n)
Variables	O(1)
✅ Why HashSet Is Used?

Because:

✔ It stores only unique elements
✔ Fast search (O(1))
✔ Prevents duplicates automatically

*/