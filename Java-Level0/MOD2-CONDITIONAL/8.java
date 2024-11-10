//Write a program to find given a specific date ,check whether the date is valid or not. Year will be in range 1900 to 9999

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] parts = date.split("/");
        
        if(parts.length!=3){
            System.out.println("Not Valid");
            return;
        }
        int dd = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int yy = Integer.parseInt(parts[2]);
        
        if(isValidDate(dd,mm,yy)){
            System.out.println("Valid");            
        }
        else{
           System.out.println("Invalid"); 
        }
    }
    public static boolean isValidDate(int day, int month, int year){
        if (year < 1900 || year > 9999) return false; 
        if (month < 1 || month > 12) return false;
        
        int[] daysinmonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(isLeapyear(year)){
            daysinmonth[1] = 29;
        }
        return day > 0 && day< daysinmonth[month-1];
    }
    public static boolean isLeapyear(int year){
        return(year%4 == 0 && year%100!=0)||(year %400 ==0);
    }
    
}
