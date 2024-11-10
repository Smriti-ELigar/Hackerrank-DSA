//program to divide the given two numbers and print the quotient without using / operator.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0;
         
        while(dividend>=divisor){
            dividend = dividend-divisor;
            quotient++;
        }
        
        System.out.println(quotient);
    }
}
//This program effectively divides the given numbers without using the division operator by employing repeated subtraction.
