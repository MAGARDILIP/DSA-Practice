public class RemoveDuplicates3 {
  public static void main(String[] args){
    boolean[] map = new boolean[256];
    String str = "appanacollege";

    StringBuilder result=new StringBuilder("");

    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
        //here java auto converts char to int 
        // ex) if ch is c then map[ch] means map[99]
      if(!map[ch]){
        map[ch] = true;
        result.append(ch);
       }
    }

    System.out.println(result);

  }
}

/*
✅ Time Complexity

⏱ O(n)
Each character checked once.

✅ Space Complexity

💾 O(1) (Constant)

Because:

256 = fixed size


Does NOT depend on input length.

✅ Memory Comparison
Method	Space	Characters
boolean[26]	O(1)	a–z only
boolean[256]	O(1)	ASCII
HashSet	O(n)	All Unicode

✅ Limitations

❌ Does NOT support full Unicode (like 😊, ₹)
❌ Works only for ASCII

For Unicode → use HashSet.

*/
