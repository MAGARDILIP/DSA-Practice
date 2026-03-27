public class Power {

  static int  power(int base,int power){
    if(power==0){
      return 1;
    }
    if(power==1){
      return base;
    }
      int prev=power(base,power-1);
      int curr=base * prev;
      return curr;
      //return base * power(base,power-1);
  }
  public static void main(String[] args){
      int base=2;
      int power=2;

      System.out.println(power(base,power));
  }
}
