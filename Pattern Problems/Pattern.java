public class Pattern{

public static void each4(int n){
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      System.out.print("*");
    }
    System.out.println();
  }
}

public static  void lpyramid(int n){
  for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();

  }
}

public static void ltriangle(int n){
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
    System.out.print(j);
  }
  System.out.println();
}
}

public static void invert(int n){
  for(int i=n;i>0;i--){
    for(int j=i;j>0;j--){
      System.out.print("*");
    }
    System.out.println();
  }
  System.out.println();
}


public static void pyramid(int n){
  for(int i=1;i<=n;i++){
    for(int s=1;s<=n-i;s++){
      System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
      System.out.print("*");
    }
    System.out.println();
  }
}

public static void floydsTriangle(int n){
  int k=1;
  for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
      System.out.print(k++);
    }
    System.out.println();
  }
}

// public static void dpyramid(int n){
//   for(int i=1;i<=n;i++){
//     for(int s=1;s<=n-i;s++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=2*i-1;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }
//     for(int i=n;i>0;i--){
//     for(int s=n-i;s>=1;s--){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=2*i-1;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }

}
  public static void main(String[] args){

    Pattern.each4(4);
    Pattern.lpyramid(4);
    Pattern.ltriangle(5);
    Pattern.invert(5);
    Pattern.pyramid(5);
    Pattern.floydsTriangle(5);
  }
