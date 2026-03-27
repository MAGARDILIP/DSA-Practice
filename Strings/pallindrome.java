public class pallindrome {
  
  static boolean isPallindrome(String str){

    int start=0;
    int end=str.length()-1;
    while(start<end){
      if(str.charAt(start++)!= str.charAt(end--)){
        return false;
      }
    }
    return true;
  }

    static boolean isPallindrome2(String str){

    String rev= new StringBuilder(str).reverse().toString();
    return rev.equals(str);// return rev==str; not work as we create new object then use toString() method on it 
   
  }

  public static void main(String[] args){
    String name ="naman";
    System.out.println(isPallindrome(name));
     System.out.println(isPallindrome2(name));
  }
}
