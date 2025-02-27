// 3. Write a program to print odd numbers between 50 to 100 in reverse order. 
// -->

class Q3 {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 50 to 100 in reverse order: ");
        for (int i = 99; i >= 51; i -= 2) {
            System.out.print(i + " ");
        }
    }
}

// Output =>

// Odd numbers between 50 to 100 in reverse order: 
// 99 97 95 93 91 89 87 85 83 81 79 77 75 73 71 69 67 65 63 61 59 57 55 53 51 