// program to check the values are equal or not
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        if(i1==i2){
            System.out.print("EQUAL");
        }
        else{
            System.out.print("NOT EQUAL");
        }
    }
}
