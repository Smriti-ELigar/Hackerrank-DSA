//Print all the alphabets for given n times.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            for(char c = 'a'; c<='z'; c++){
                System.out.print(c + " ");
            }
            System.out.println();//to print new line
        }
    }
}
