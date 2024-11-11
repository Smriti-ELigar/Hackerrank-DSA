import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        
        long rev = reverse(num);  // get the reverse of num
        long numsq = num * num;   // square of the original number
        long revsq = rev * rev;   // square of the reversed number
        long revNumsq = reverse(numsq); // reverse of the square of the original number (any 1 needs to be reveresed to check)
        
        // now numsq and revsq should be reverse of each other
        if (revsq == revNumsq) {
            System.out.print("Adam Number");
        } else {
            System.out.print("Not a adam number");
        }
    }

    static long reverse(long n) {
        long rev = 0;
        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}
