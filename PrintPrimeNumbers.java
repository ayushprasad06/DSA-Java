/*
Problem:
Print all prime numbers from 1 to n.

Topic:
Basic Mathematics

Approach:
For every number from 2 to n, check whether it is divisible by any number from 2 to its square root. If it is not divisible, then it is a prime number.

Time Complexity:
O(n * sqrt(n))

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = scan.nextInt();

        for(int num = 2; num <=n; num++){

            boolean isPrime = true;

            for(int div = 2; div*div <= num; div++){

                if(num%div == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }
        }
        scan.close();
    }
}