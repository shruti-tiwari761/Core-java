/*Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
       Ex - 12321 - Rerverse - 12321*/
package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == org) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }

        sc.close();
    }
}
