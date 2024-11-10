//Program to find the product of the digits in a given number
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long prod = 1;

        while(num>0){
            long digit = num%10;
            prod = prod*digit;
            num/=10;
            }
        System.out.print(prod);
    }
}
