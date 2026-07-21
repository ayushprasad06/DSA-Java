/*
Problem:
Reverse the given number.

Topic:
Basic Mathematics

Approach:
Extract the last digit of the number using modulus operator (%).
Add the extracted digit to the reversed number by multiplying the current
reversed number by 10 and adding the digit.
Remove the last digit from the original number using division (/).
Repeat until the number becomes 0.

Time Complexity:
O(log10(n))

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scan.nextInt();

        int reversedNumber = 0;

        while(number != 0){

            int lastDigit = number%10;

            reversedNumber = reversedNumber * 10 + lastDigit;

            number = number/10;

        }

        System.out.println("Reversed number: " + reversedNumber);
        
        scan.close();

    }
}