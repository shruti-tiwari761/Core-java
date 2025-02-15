package Loop;

import java.util.Scanner;

public class EvenOddSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n number");
	int n= sc.nextInt();
	int evenSum=0;
	int oddSum=0;
	System.out.println("Enter n numbers whose even and odd sum you want : ");
	for(int i=0;i<n;i++) {
		i=sc.nextInt();
		if(i%2==0) {
			evenSum+=i;
		}
		else {
			oddSum+=i;
		}
	}
	System.out.println("Even Sum "+evenSum);
	System.out.println("Odd Sum "+oddSum);
}
}
