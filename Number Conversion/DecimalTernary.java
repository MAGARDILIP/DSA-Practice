public class DecimalTernary {
  public static void dToT(){
    int ternary=0;
    int pow=0;
    int decimal = 11;

    while(decimal > 0){
      int rem = decimal % 3;
      ternary += rem * (int) Math.pow(10,pow);
      pow++;
      decimal /=3;
    }

    System.out.println(ternary);
  }

  public static void tToD(){
    int ternary=102;
    int decimal=0;
    int pow=0;

    while (ternary > 0){
      int lastDigit = ternary %10;
      decimal += lastDigit *(int)Math.pow(3,pow);
      pow++;
      ternary /= 10;
    
    }
    System.out.println(decimal);
  }

  public static void main(String args[]){
    DecimalTernary.dToT();
     DecimalTernary.tToD();
  }
}
