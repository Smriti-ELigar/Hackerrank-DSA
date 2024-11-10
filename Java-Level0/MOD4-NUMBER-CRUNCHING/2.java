//program Count the number of occurrences of a digit in a given number
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int digit = sc.nextInt();
        int count = 0;

        while(num>0){
            if(num%10 == digit){ //to check last digit value
                count++;
            }
            num = num/10; //to remove last digit
        }
        System.out.print(count);
    }
}
//To move to the next digit, you need to remove the last digit you just processed. This is done by integer division by 10.
//When you divide an integer by 10, you effectively shift all the digits one place to the right and discard the last digit.
