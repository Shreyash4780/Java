// 12. Write a Java program of constructor overloading.
// -->

class Q12 {
        Q12() {
             System.out.println("Default Constructor"); 
        } 
    
        Q12(String name) { 
            System.out.println("Constructor with name: " + name);
        }
    
        Q12(int rollNo, String name) {
            System.out.println("Constructor with name: " + name + "Roll: " + rollNo);
        }
    
    public static void main(String[] args) {
        Q12 s1 = new Q12(); 
        Q12 s2 = new Q12("ABC"); 
        Q12 s3 = new Q12(102, "ABC");
    
    }
}

// Output =>

// Default Constructor
// Constructor with name: ABC
// Constructor with name: ABCRoll: 102