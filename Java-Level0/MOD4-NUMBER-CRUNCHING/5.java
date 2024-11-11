// program to display the digits of a given number from right to left
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
        }
    }
}

//Instead of building a reversed number, we print each digit immediately after extracting it.
