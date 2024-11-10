//program to find the LCM of the given two numbers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt(); 
        int lcm = findlcm(num1, num2); 
        System.out.println(lcm);
    }
    static int findlcm(int a, int b){
        return (a*b)/findgcd(a,b);
    }
    static int findgcd(int a,int b){
        if(b==0)return a;
        return findgcd(b,a%b);
    }
}
//he Least Common Multiple (LCM) of two numbers is the smallest number that is a multiple of both.
//findLCM method calculates the LCM using the formula 
//findGCD method calculates the GCD using the Euclidean algorithm.
