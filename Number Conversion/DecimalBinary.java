public  class DecimalBinary {

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
    public static void bToD(int binaryNum){
        int pow=0;
        int dec=0;
        while(binaryNum>0){
            int lastDigit=binaryNum % 10;
            dec += (lastDigit * Math.pow(2,pow));
            pow++;
            binaryNum /=10;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        DecimalBinary.dToB(10);
        DecimalBinary.bToD(1010);
    }

}
