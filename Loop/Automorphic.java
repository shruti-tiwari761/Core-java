//Automorphic number 5 = 25 = 625 = 390625, 6=36, 76 = 5776
package Loop;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;

        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }

        sc.close();
    }
}
