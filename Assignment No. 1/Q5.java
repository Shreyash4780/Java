import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter consumed units: ");
        int units = sc.nextInt();
        int bill = 0;

        if (units > 300) 
           bill = (units - 300) * 25 + 100 * 20 + 100 * 15 + 100 * 10;
        else if (units > 200) 
           bill = (units - 200) * 20 + 100 * 15 + 100 * 10;
        else if (units > 100) 
           bill = (units - 100) * 15 + 100 * 10;
        else 
           bill = units * 10;

        System.out.println("Total Bill: " + bill);
    }
}

// Enter consumed units: 350
// Total Bill: 5750

