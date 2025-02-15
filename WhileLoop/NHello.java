/*Print hello until user gives wrong input using do while
*/package WhileLoop;

import java.util.Scanner;

public class NHello {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
        do {
            System.out.println("Hello");
            System.out.print("Press 'y' to continue, any other key to exit: ");
            input = scanner.next().charAt(0);
        } while (input == 'y' || input == 'Y');
	}
}
