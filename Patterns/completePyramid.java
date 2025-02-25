package Patterns;

import java.util.Scanner;

public class completePyramid {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		for (int i = num-1; i >= 1; i--) { 
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
