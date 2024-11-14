// Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .
// She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
// Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

// beautifulDays has the following parameter(s):
// int i: the starting day number
// int j: the ending day number
// int k: the divisor
// Returns
// int: the number of beautiful days in the range
  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while(i<=j){
            int diff = Math.abs(i-reverse(i));
            if ((diff % k) ==0){
                count++;
            }
            i++;
        }
        return count;
    }
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
            
        }
        return rev;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
