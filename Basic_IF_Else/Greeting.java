package Basic;

import java.util.Scanner;

public class Greeting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	char ch= sc.next().charAt(0);
	if (ch == 'm' || ch == 'M') {
        System.out.println("Good morning sir");
    }
	else if(ch =='f'|| ch=='F') {
		 System.out.println("Good morning ma'am");
	}
	else {
		 System.out.println("Invalid input");
	}
}
}
