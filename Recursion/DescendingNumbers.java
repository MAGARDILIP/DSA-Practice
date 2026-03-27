

public class DescendingNumbers {

    static void display(int n){
      if(n==0) return;
      System.out.println(n);
      display(n-1);
    }
    
  public static void main(String[] args){
    int n=10;
    display(n);
  
  }
}
