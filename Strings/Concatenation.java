import java.util.ArrayList;

public class Concatenation {
  public static void main(String[] args){
    System.out.println('a');
    System.out.println('b');
    System.out.println('a'+'b');//195 it does not print ab 
    // beacuse + operator works only when there is atleast one string 
    System.out.println((char) 'a'+'b');

    System.out.println(10);
    //here 10 is converted into object of Integer then toString() method is call on it 

    //System.out.println(new Integer(10) + new ArrayList<>());
    //above will give error because atleast one string is required 
    System.out.println(new Integer(10) + "" + new ArrayList<>());//10[]
    //here println call toString() methods on both objects 

    System.out.println("a"+"b");//ab
  }
}
