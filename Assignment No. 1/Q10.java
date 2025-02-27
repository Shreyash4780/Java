// 10. Write a java class to accept student details like roll no., name and   
//    address and display it.
// -->

import java.util.Scanner;

public class Q10 {

    int rollNo;
    String name, address;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        sc.nextLine();  

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    void display() {
        System.out.println("\nStudent Details:\nRoll No: " + rollNo + "\nName: " + name +"\nAddress: " + address);
    }

    public static void main(String[] args) {
        Q10 s = new Q10();
        s.accept();
        s.display();
    }
}

// Output =>

// Enter Roll No: 101
// Enter Name: ABC    
// Enter Address: XYZ

// Student Details:
// Roll No: 101
// Name: ABC
// Address: XYZ