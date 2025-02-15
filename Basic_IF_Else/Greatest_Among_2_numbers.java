package Basic;

import java.util.Scanner;

public class Greatest_Among_2_numbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b)System.out.println("A is greater");
        else System.out.println("B is greater");
	}
}
