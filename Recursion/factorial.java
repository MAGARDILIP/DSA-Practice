//tc => n
//sc => n        

public class factorial {
    static int fact(int n){
    if(n==0){
      return 1;
    }

    int fact_of_n_minus_one=fact(n-1);
    int fact_of_n=n * fact_of_n_minus_one;
    return fact_of_n;

    //return n*fact(n-1);
  }
  public static void main(String[] args){
    int n=5;
    System.out.println(fact(n));
  }

  
}
