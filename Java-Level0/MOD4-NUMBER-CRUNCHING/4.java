//Print all the prime digits in a given number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long a, rev = 0, digit;

        // Reverse the number
        while (num != 0) {
            a = num % 10;
            rev = rev * 10 + a;
            num = num / 10;
        }

        // Check each digit in the reversed number for primality
        while (rev != 0) {
            digit = rev % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
            }
            rev = rev / 10;
        }

        scanner.close();
    }
}
//Reverse the Number:

// First iteration:

// a = num % 10 = 35712 % 10 = 2
// rev = rev * 10 + a = 0 * 10 + 2 = 2
// num = num / 10 = 35712 / 10 = 3571
// Second iteration:

// a = num % 10 = 3571 % 10 = 1
// rev = rev * 10 + a = 2 * 10 + 1 = 21
// num = num / 10 = 3571 / 10 = 357

// Check for Prime Digits in the Reversed Number:

// We now iterate through each digit of rev (21753) and check for prime digits (2, 3, 5, or 7).

// First iteration:

// pri = rev % 10 = 21753 % 10 = 3
// Since 3 is a prime digit, print 3.
// rev = rev / 10 = 21753 / 10 = 2175
// Second iteration:

// pri = rev % 10 = 2175 % 10 = 5
// Since 5 is a prime digit, print 5.
// rev = rev / 10 = 2175 / 10 = 217
// Third iteration:

// pri = rev % 10 = 217 % 10 = 7
// Since 7 is a prime digit, print 7.
// rev = rev / 10 = 217 / 10 = 21
// Fourth iteration:

// pri = rev % 10 = 21 % 10 = 1
// 1 is not a prime digit, so it is skipped.
// rev = rev / 10 = 21 / 10 = 2
// Fifth iteration:

// pri = rev % 10 = 2 % 10 = 2
// Since 2 is a prime digit, print 2.
// rev = rev / 10 = 2 / 10 = 0
// At this point, rev is 0, so the loop ends.
