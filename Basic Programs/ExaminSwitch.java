
public class ExaminSwitch {
  public static void main(String[] args){
    int x=10;
    int a=5;
    int b=5;
    final int c=5;
    final int d=6;

    switch(x){
      case 1: System.out.println("one");
        break;
      case 2: System.out.println("two");
        break;
      case 5+5: System.out.println("ten");
        break;
      case 9:System.out.println("nine");
          break;
      case c+d:System.out.println("ten");
      break;

      // case a+b:System.out.println("ten");
     // ExaminSwitch.java:17: error: constant expression required
    // a, b, c are variables
    // Their values are known only at runtime
    // case needs compile-time constants

      // case 1:System.out.println("nine");
      // break;
      //ExaminSwitch.java:14: error: duplicate case label
      default:System.out.println("case not found");
    }
  }
}
