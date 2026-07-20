/*
Problem:
Print digits of a number in the same order as given.

Topic:
Basic Mathematics

Approach:
First count the number of digits to find the starting divisor.
Then extract each digit from left to right using division.


Time Complexity:
O(log10(n))

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class PrintDigitsOfNumber{

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scan.nextInt();

        int digitCount = 0;
        int temporaryNumber = number;

        while (temporaryNumber !=0) {

            temporaryNumber = temporaryNumber/10;
            digitCount++;

        }
        
        int divisor = (int) Math.pow(10, digitCount-1);

        while (divisor !=0) {
            
            int currentDigit = number / divisor;

            System.out.println(currentDigit);

            number = number%divisor;
            divisor = divisor/10;
        }

        scan.close();

    }
}