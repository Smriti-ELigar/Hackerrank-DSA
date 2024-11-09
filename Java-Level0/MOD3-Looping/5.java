//program to print the multiplication table as per the multiplicant and n.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1;i<=mul;i++){
            int product = multiply(i,n);
           System.out.println(i +" "+"*"+" "+ n +" "+ "="+" " + product); 
        }
        

    }
    static int multiply(int a,int b){
        return a*b;

    }
}
