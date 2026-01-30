public class Math {

  public static void dSum(int n){
    int sum=0;
    while(n>0){
      int rem=n%10;
     sum +=rem;
      n /=10;
    }

    System.out.println(sum);
  }

  public static boolean checkPallindrome(int n){
    int temp=n;
    int rev=0;
    while(n>0){
      int rem = n % 10;
      rev = rev * 10 + rem;
      n /=10;
    }
    return temp==rev;
  }

  public static void gcd(int a, int b){
    int gcd= Math.gcd(a,b);
  }
  public static void main(String[] args){
    Math.dSum(121);
    System.out.println(Math.checkPallindrome(12212));

  }
}
