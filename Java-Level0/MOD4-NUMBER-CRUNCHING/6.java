// reverse. whenever u get runtime error use long everywhere
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long rev = 0;
        
        
        while(num>=1){
            long digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
            
        }

        System.out.print(rev);
    }
}    
