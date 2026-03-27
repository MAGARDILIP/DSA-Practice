

public class DigitOccurrence {

    public static void main(String[] args) {

        int num = 1123401;
        int digit;
        int[] count = new int[10]; // index 0–9 for digits

        while (num > 0) {
            digit = num % 10;   // extract last digit
            count[digit]++;    // increase count
            num = num / 10;    // remove last digit
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}


