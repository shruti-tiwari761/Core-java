package Loop;

import java.util.Scanner;

public class Oneton {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value of n");
	int n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println(i);
	}
}
}
