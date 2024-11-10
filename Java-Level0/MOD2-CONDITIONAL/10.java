//Write a program to print the respective month name based on given input

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] month ={"January", "February", "March", "April", "May","June","July","August","September","October","November","December"};
        if(a<1 || a>12){
            System.out.print("Invalid");
        }
        else{
         System.out.print(month[a-1]);   
         //System.out.print(month[a - 1]);       
        }
    }
}
