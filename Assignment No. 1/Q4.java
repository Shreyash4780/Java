// 4. Write a Java program which prints given nber is prime or not. 
// -->

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 2) { 
           System.out.println(n + " is not Prime number.");
           return;
        }
             
        for (int i = 2; i < n; i++) 
            if (n % i == 0) {
                System.out.println(n + " is not Prime number.");
                return;
            }
        System.out.println(n + " is Prime number.");

    }
}

// Output =>

// Enter a number: 2
// 2 is Prime number.

// Enter a number: 4
// 4 is not Prime number.
