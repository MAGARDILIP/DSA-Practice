public  class DecimaBinary {

    public static void dToB(int n){
       int rem=1, pow=0 , binary=0;
        while(n>0){
            rem=n%2;
            binary= binary + (rem* (int ) Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.println(binary);
    }

    public 
    public static void main(String args[]){
        DecimaBinary.dToB(10);
    }

}
