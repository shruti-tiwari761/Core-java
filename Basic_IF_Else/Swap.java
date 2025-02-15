package Basic;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        while (true) {
            System.out.println("Choose a swapping method:");
            System.out.println("1. Using a third variable");
            System.out.println("2. Using addition and subtraction");
            System.out.println("3. Using multiplication and division");
            System.out.println("4. Using bitwise XOR");
            System.out.println("5. Using a single statement");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            System.out.println("Before swapping: a = " + a + ", b = " + b);
            switch (choice) {
                case 1: // Using a third variable
                    int temp = a;
                    a = b;
                    b = temp;
                    break;
                
                case 2: // Using addition and subtraction
                    a = a + b;
                    b = a - b;
                    a = a - b;
                    break;
                
                case 3: // Using multiplication and division (ensure no zero values)
                    if (a != 0 && b != 0) {
                        a = a * b;
                        b = a / b;
                        a = a / b;
                    } else {
                        System.out.println("Multiplication and division swapping is not possible with zero values!");
                        continue;
                    }
                    break;
                
                case 4: // Using bitwise XOR
                    a = a ^ b;
                    b = a ^ b;
                    a = a ^ b;
                    break;
                
                case 5: // Using a single statement
                    b = a + b - (a = b);
                    break;
                
                case 6: // Exit
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }
            
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }
}
