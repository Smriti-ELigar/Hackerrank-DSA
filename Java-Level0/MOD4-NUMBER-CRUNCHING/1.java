//Count the number of digits in a given number
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long num = sc.nextLong();
        int count = 0;
        
        if (num == 0) { 
            System.out.println(1); 
            return; 
        }
        num = Math.abs(num);
        
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.print(count);
        
    }
}
