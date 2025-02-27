// 20. Write a java program to implement any interface.
// -->

// Defining an interface
interface One {
    void Show(); // Abstract method 
}

// Implementing the interface in a class
class Two implements One {
    public void Show() {
        System.out.println("Implementation of One class (Interface)");
    }
}

class Q20 {
    public static void main(String[] args) {
        One myTwo = new Two();
        myTwo.Show(); 
    }
}

// Output =>

// Implementation of One class (Interface)