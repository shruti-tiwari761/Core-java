 //Make a choice based calculator using do while
package WhileLoop;

import java.util.Scanner;

public class Callculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double a, b, result;

        do {
            System.out.println("\n--- Choice Based Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number (a): ");
                a = scanner.nextDouble();
                System.out.print("Enter second number (b): ");
                b = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = a + b;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = a - b;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = a * b;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (b != 0) {
                            result = a / b;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (choice != 5);

        System.out.println("Calculator exited. Thank you!");
        scanner.close();
    }
}

