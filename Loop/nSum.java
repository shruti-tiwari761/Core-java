package Loop;

import java.util.Scanner;

public class nSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("Enter n numbers whose you want to sum");
		for (int i = 0; i <= n; i++) {
			i = sc.nextInt();
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
