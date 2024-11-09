//Divisibilty by 3
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0){
            System.out.print("The number is divisible by 3");
        }
        else{
            System.out.print("The number is not divisible by 3 and gives a remainder "+ (a % 3));
        }

    }
}
