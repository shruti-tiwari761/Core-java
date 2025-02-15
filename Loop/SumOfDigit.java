//Sum of digits of a number, 936 = 18
package Loop;

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number whose sum you want :");
	int num=sc.nextInt();
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum+=digit;
		num=num/10;
	}
	System.out.println("Sum of digit is "+sum);
}
}
