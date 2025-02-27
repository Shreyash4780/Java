// 8. Write a Java program to implement multidimensional array.

import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        System.out.println("Enter " + (arr.length * arr[0].length * arr[0][0].length) + " elements: ");
        for (int[][] layer : arr)
            for (int[] row : layer)
                for (int i = 0; i < row.length; i++)
                    row[i] = sc.nextInt();

        System.out.println("\nMultidimensional Array:");
        for (int[][] layer : arr){
            for (int[] row : layer) {
                for (int num : row) System.out.print(num + " ");
                System.out.println();
            }
            System.out.println();
        }
        
    }
}

// Output =>

// Enter 8 elements: 
// 10 20 
// 20 30

// 40 50
// 60 70

// Multidimensional Array:
// 10 20 
// 20 30 

// 40 50 
// 60 70 