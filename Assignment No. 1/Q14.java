// 14. Write a Java program to implement static method and static block.
// -->

class Q14 {

    static {
        System.out.println("Static Block Executed");
    }
    
    static void display() {
        System.out.println("Static Method Called");
    }
    public static void main(String[] args) {
        Q14.display();
    }
}

// Output =>

// Static Block Executed
// Static Method Called
    

