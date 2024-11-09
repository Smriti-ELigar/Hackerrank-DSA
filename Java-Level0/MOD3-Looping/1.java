//program to find whether the given number is power of 2 or not.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
// A number is a power of 2 if it has exactly one bit set in its binary representation
// take the log of the number on base 2 and if you get an integer then the number is the power of 2       
// Keep dividing the number by two, i.e, do n = n/2 iteratively. In any iteration, if n%2 becomes non-zero and n is not 1 then n is not a power of 2. If n becomes 1 then it is a power of 2.
      public static void main(String[] args) { 
           Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(isPowerof2(num)){
                    System.out.print("YES");
            }
            else{
                   System.out.print("NO") ;
            }
            
        }
      static boolean isPowerof2(int n){
                    if (n==0){
                            return false;
                    }
                    return (n&(n-1))==0;
            }
}
        // while (n != 1) {
        //     if (n % 2 != 0)
        //         return false;
        //     n = n / 2;
        // }
        // return true;


//  return (int)(Math.ceil((Math.log(n) / Math.log(2))))== (int)(Math.floor(((Math.log(n) / Math.log(2)))));
                
