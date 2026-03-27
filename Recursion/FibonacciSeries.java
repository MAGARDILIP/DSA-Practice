
/*
⚠️ Hidden Interview Question #1
❓ What is the time complexity of this code?

👉 O(2ⁿ) ❌ very inefficient

Because:

Same values are recalculated again and again
space complexoty is n 

⚠️ Hidden Interview Question #2
❓ What happens if n = 40?

👉 Program becomes very slow 😵

⚠️ Hidden Interview Question #3
❓ What happens if n is large (like 50+)?

👉 StackOverflowError risk due to deep recursion
 */
public class FibonacciSeries {

  static int fib(int n){
    if(n==0 || n==1){
      return n ;
    }
 
    int fib_of_n_minus_one=fib(n-1);
    int fib_of_n_minus_two=fib(n-2);
    int fib_of_n=fib_of_n_minus_two + fib_of_n_minus_one;
    return fib_of_n;

    //return fib(n-1) + fib(n-2);//same as  return fib(n-2) + fib(n-1) ;

  }
  public static void main(String[] args){
    int n=50;
    for(int i=0;i<n;i++){
       System.out.print(fib(i) +  " ");
    }
  

  }
}
