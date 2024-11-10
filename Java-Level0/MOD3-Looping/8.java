//program to find the sum of even numbers in the given range
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i= 0;i<=n;i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
