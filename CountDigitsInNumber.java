/*
Problem:
Count the number of digits in a given number.

Topic:
Basic Mathematics

Approach:
Repeatedly divide the number by 10.
Each division removes the last digit.
Count how many times the number can be divided until it becomes 0.

Time Complexity:
O(log10(n))

Space Complexity:
O(1)
*/


import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        int count = 0;

        while(num>0) {

            num = num/10;
            count++;
        }
        System.out.println("Number of digits: " + count);

        scan.close();
    }
}