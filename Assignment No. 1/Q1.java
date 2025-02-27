// 1. Write a Java menu driven program using switch case to perform all Arithmetic operations on two Integers.
// -->

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division\n5 : Modulus\n6 : Exit\nEnter your choice: ");
            int ch = sc.nextInt();

            if (ch == 6) {
                System.out.println("Exited...");
                return;
            }

            if (ch < 1 || ch > 5) { 
                 System.out.println("\nInvalid ch. Please try again.");
                 continue;
            }
            
            System.out.print("\nEnter two numbers: ");
            int num1 = sc.nextInt(), num2 = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nAddition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("\nSubtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("\nMultiplication: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num2 != 0 ? "\nDivision: " + (num1 / num2) : "\nCannot divide by zero");
                    break;
                case 5:
                     System.out.println(num2 != 0 ? "\nModulus: " + (num1 % num2) : "\nCannot modulus by zero");
                     break;
            }
        }
    }
}

// Output =>

// 1 : Addition
// 2 : Subtraction
// 3 : Multiplication
// 4 : Division
// 5 : Modulus
// 6 : Exit
// Enter your choice: 1

// Enter two numbers: 10 20

// Addition: 30

// 1 : Addition
// 2 : Subtraction
// 3 : Multiplication
// 4 : Division
// 5 : Modulus
// 6 : Exit
// Enter your choice: 7

// Invalid ch. Please try again.

// 1 : Addition
// 2 : Subtraction
// 3 : Multiplication
// 4 : Division
// 5 : Modulus
// 6 : Exit
// Enter your choice: 6
// Exited...