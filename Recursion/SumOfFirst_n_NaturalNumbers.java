public class SumOfFirst_n_NaturalNumbers {
  static int sum(int n){
    if(n==0){
      return 0;
    }
    int sum_of_first_n_minus_one= sum(n-1);
    int sum_of_first_n=n+sum_of_first_n_minus_one;
    return sum_of_first_n;
  }
  public static void main(String[] args){
    int n=10;
    System.out.println(sum(n));
  }
}
