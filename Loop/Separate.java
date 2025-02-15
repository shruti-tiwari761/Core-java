/*Seprate each digit of a number and print it on the new line ex - 123
	OP
		3
		2
		1*/
package Loop;

import java.util.Scanner;

public class Separate {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	while (num > 0) {
        int digit = num % 10;
        System.out.println(digit); 
        num /= 10;
    }
}
}
