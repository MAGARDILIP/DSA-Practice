

public class AscendingNumbers {
  static void display(int n){
    if(n==1){
      System.out.print(1+" ");
      return;
    }
    display(n-1);
    System.out.print(n + " ");
    
  }
  public static void main(String[] args){
    int n=10;//1 2 3 4 5 6 7 8 9 10
      display(n);
  }
}
