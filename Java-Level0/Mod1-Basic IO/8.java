//program to accept 2 numbers, print the first number as a 5-digit number and print the second number in the next line with 5 width space
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Integer i1 = sc.nextInt();
        Integer i2 = sc.nextInt();
        System.out.printf("%05d\n",i1);
        //%05d: The 5 specifies the width of the output, and the 0 ensures that if the number has fewer than 5 digits, it will be padded with leading zeros. The d indicates the number is an integer.
        System.out.printf("%5d\n",i2);
        //%5d: The 5 here specifies that the output should occupy 5 spaces, right-aligned by default. If the number is smaller than 5 digits, it will be padded with spaces on the left.
    }
}
