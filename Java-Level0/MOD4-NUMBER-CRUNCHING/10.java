// A strong number is a positive integer where the sum of the factorials of its digits is equal to the original number: 
// Explanation: For example, 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145
// Checking if a number is strong: To check if a number is strong, you can calculate the factorial of each digit of the number, add them up, and then compare the result with the original number.
import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long old = num;
        long sum = 0;

        while (num > 0) {
            long digit = num % 10;   
            sum += fact(digit);
            num = num / 10;  
        }

        if (old == sum) {
            System.out.print("Strong Number");
        } else {
            System.out.print("Not a strong number");
        }
    }
    static long fact(long n){
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // multiply factorial by i
        }
        return fact;
    }
}
