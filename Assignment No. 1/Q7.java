// 7. Write a Java program to implement jagged array.
// -->

class Q7 {
        public static void main(String[] args) {
            int[][] arr = { {1, 2}, {3, 4, 5}, {6} };
            
            System.out.println("Jagged array: ");
            for (int[] row : arr) {
                for (int num : row) 
                    System.out.print(num + " ");
                System.out.println();
            }
        }
}

// Output =>

// Jagged array: 
// 1 2 
// 3 4 5 
// 6 
