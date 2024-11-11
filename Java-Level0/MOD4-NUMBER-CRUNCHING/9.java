import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String numStr = Long.toString(num);//long too long to calc lrngth
        int len = numStr.length();  // length of the number
        long old = num;
        long sum = 0;

        while (num > 0) {
            long digit = num % 10;   // get the last digit
            sum += Math.pow(digit, len);  // add the digit raised to the power of the length
            num = num / 10;   // remove the last digit
        }

        if (old == sum) {
            System.out.print("Armstrong number");
        } else {
            System.out.print("Not an Armstrong number");
        }
    }
}
