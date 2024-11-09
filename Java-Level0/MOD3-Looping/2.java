//program to print all the even numbers in the given range.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in); 
        int start = sc.nextInt(); 
        int end = sc.nextInt();
        for(int i = start; i<=end;i++){
            if(isEven(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    static boolean isEven(int n){
        return n%2==0;
    }
}
