package Basic;

import java.util.Scanner;

public class ValidToVote {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name ");
	String name= sc.next();
	System.out.println("Enter your age");
	int age= sc.nextInt();
	if(age>18) {
		System.out.println("Hi ,"+name+" You are eligible to vote");
	}
	else {
		System.out.println("You are not eligible to vote "+name+" as you can vote after "+(18-age)+" years");
	}
}
}
