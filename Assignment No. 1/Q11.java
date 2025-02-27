// 11. Write a Java program which accepts emp id and emp name, use  them   
//        as actual parameter and send them to the constructor, after that       
//        display the record from constructor.
// -->

import java.util.Scanner;

class Q11 {
    int empId;
    String empName;

    Q11(int id, String name) {
        empId = id;
        empName = name;
        display();
    }


    void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();  

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        Q11 obj = new Q11(id, name);
    }
}

// Output =>

// Enter Employee ID: 101
// Enter Employee Name: ABC

// Employee Details:
// Employee ID: 101
// Employee Name: ABC

