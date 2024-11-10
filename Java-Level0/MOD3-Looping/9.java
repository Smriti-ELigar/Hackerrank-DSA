//program multiply the given two numbers without using * operator.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = 0;
        
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        
        while(absB>0){
            prod = prod + absA;
            absB--;
        }
        // Adjusting the sign of the product 
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            prod = -prod; 
        }
        System.out.println(prod);
    }
}
// absA = 3 and absB = 4.
// The while loop runs 4 times, adding 3 to prod in each iteration.
// After 1st iteration: prod = 3
// After 2nd iteration: prod = 6
// After 3rd iteration: prod = 9
// After 4th iteration: prod = 12
// Since a is negative and b is positive, prod is made negative: prod = -12.

// This operation is equivalent to adding a to itself b times, which is the definition of multiplication (a * b = a + a + ... + a, repeated b times).

// After each addition, absB is decreased by 1 (absB--), so the loop will eventually end once absB reaches zero
