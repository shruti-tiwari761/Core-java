package Basic;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a = sc.nextInt();
		System.out.println("Enter a first number : ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}
}
