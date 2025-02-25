package Patterns;

import java.util.Scanner;

public class MirrorrRightAngleTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num= sc.nextInt();
	for (int i = 1; i <= num; i++) {
        for (int j = num - i; j > 0; j--) {
            System.out.print("  "); 
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
