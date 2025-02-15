package Loop;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int count=0;
	if(num<2) {
		System.out.println("Not");
	}else {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
	}
	if(count<=2) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not");
	}
}
}
