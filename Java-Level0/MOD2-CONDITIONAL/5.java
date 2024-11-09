import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.print("HiHello");
        }
        else if(a%3==0){
            System.out.print("Hi");
        }
        else if(a%5==0){
            System.out.print("Hello");
        }
    }
}
