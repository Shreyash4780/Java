// 6 Write a Java program to which input elements from user for 1D array and display it.
// --> 

import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt(), arr[] = new int[n];

        System.out.print("\nEnter " + n + " elements: ");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        System.out.print("\n1D Array elements: ");
        for (int num : arr) 
            System.out.print(num + " ");

    }
}

// Output =>

// Enter no. of elements: 5

// Enter 5 elements: 10 20 30 40 50

// 1D Array elements: 10 20 30 40 50 
