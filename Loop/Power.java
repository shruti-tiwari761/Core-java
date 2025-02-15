package Loop;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	System.out.println("Enter a number");
	int b=sc.nextInt();
	int result = 1; 
    for (int i = 1; i <= b; i++) {
        result *= a;
    }
    System.out.println(a + "^" + b + " = " + result);
}
}
