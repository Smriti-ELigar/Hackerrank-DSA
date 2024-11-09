//Write a program to print corresponding day based on given input
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] days ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if(a<0 || a>6){
            System.out.print("Invalid");
        }
        else{
         System.out.print(days[a]);   
        }
    }
}
