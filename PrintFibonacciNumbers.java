/*
Problem:
Print Fibonacci series up to n terms.

Topic:
Basic Mathematics

Approach:
Start with the first two Fibonacci numbers (0 and 1).
Each next number is calculated by adding the previous two numbers.


Time Complexity:
O(n)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class PrintFibonacciNumbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scan.nextInt();

        int first = 0;
        int second = 1;

        for(int i = 1; i<=n; i++){

            System.out.print(first + " ");

            int third = first + second;

            first = second;
            second = third;
        }

        scan.close();
    }
}