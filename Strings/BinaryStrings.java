//Print all binary strings of length n such that no two 1s come together.

// ✅ Valid Example (n = 3)

// All binary strings of length 3:

// 000 ✅
// 001 ✅
// 010 ✅
// 011 ❌ (has 11)
// 100 ✅
// 101 ✅
// 110 ❌ (has 11)
// 111 ❌ (has 11)


// So output should be:

// 000
// 001
// 010
// 100
// 101

// | Parameter   | Meaning                          |
// | ----------- | -------------------------------- |
// | `n`         | How many places are left         |
// | `lastPlace` | What was the last digit (0 or 1) |
// | `str`       | String built so far              |


// 1️⃣ Always Add 0
// printBinStrings(n-1, 0, str+"0");


// We always allow 0.

// Why?

// Because 0 never creates 11.

// So after any number → 0 is safe.

// 2️⃣ Add 1 Only If Last Was 0
// if(lastPlace == 0) {
//     printBinStrings(n-1, 1, str+"1");
// }


// We add 1 only when previous digit is 0.

// Why?

// If last was 1 and we add 1 → 11 ❌ (not allowed)

// ✅ Time Complexity

// Each position tries 2 choices (mostly):

// So:

// O(2^n)

public class BinaryStrings {
  public static void  printBinStrings(int n , int lastPlace , String result){
     // Base Case
    if(n==0){
      System.out.println(result);
      return;
    }
    // Always add 0
    printBinStrings(n-1,0,result+"0");

     // Add 1 only if last was 0
    if(lastPlace == 0){
      printBinStrings(n-1,1,result+"1");
    }

  }

    public static void  printBinStrings2(int n , int lastPlace , StringBuilder result){
    if(n==0){
      System.out.println(result);
      return;
    }
    printBinStrings2(n-1,0,result.append("0"));

//     For n = 2

//         ""
//        /  \
//      "0"  "1"
//      / \
//   "00" "01"



// To move between branches:

// We must remove last char.

// Otherwise, tree breaks.
    //to undo the last change before going to the next recursive path.
    //Always delete only after append.
    //deleteCharAt removes the last added character so that recursion can try a new path correctly. It is used for backtracking.
    result.deleteCharAt(result.length()-1);
    if(lastPlace == 0){
      printBinStrings2(n-1,1,result.append("1"));
      result.deleteCharAt(result.length()-1);
    }


  //             ""
  //         /       \
  //       "0"       "1"
  //      /   \        |
  //  "00"   "01"    "10"

  }

  public static void main(String[] args){

    printBinStrings(3,0,"");
        // 000
        // 001
        // 010
        // 100
        // 101

        System.out.println();
    printBinStrings2(3,0,new StringBuilder());
  }
  
}
