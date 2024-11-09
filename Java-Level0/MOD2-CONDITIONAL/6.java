import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int year = sc.nextInt(); 
         // Check if the year is a leap year 
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
             System.out.print("Leap year"); 
         }          
        else { 
            System.out.print("Not a Leap year");
    }
}
}
