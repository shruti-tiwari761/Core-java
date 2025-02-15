/*Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
       Ex- 145 = 1! + 4! + 5! = 145*/
package Loop;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int org = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == org) {
            System.out.println(org + " is a Strong Number");
        } else {
            System.out.println(org + " is not a Strong Number");
        }

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

