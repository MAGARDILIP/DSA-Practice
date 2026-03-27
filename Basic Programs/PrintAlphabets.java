

public class PrintAlphabets {
  public static void main(String[] args){
  
    for(char ch='A'; ch<='Z';ch++){
      System.out.print(ch);
    }
    System.out.println();
    for(char ch='a';ch<='z';ch++){
      System.out.print(ch);
    }
    System.out.println();
    for(int i=65;i<=90;i++){
      System.out.print((char)i);
    }
    System.out.println();

    for(int i=97;i<=122;i++){
      System.out.print((char)i);
    }
    System.out.println();
    for(int i=65;i<=90;i++){
      System.out.print((char)i);
      System.out.print((char)(i+32));
    }
  }
}
