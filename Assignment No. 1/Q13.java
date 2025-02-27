// 13. Write a Java program which refers current executing object.  
//           a)inside the constructor.      b) inside the member function.
// -->

class Q13 {
    
    Q13() {
        System.out.println("Inside Constructor: " + this);
    }
    
    void display() {
        System.out.println("Inside Member Function: " + this);
    }
    
    public static void main(String[] args) {
        Q13 obj = new Q13(); 
        obj.display(); 
    }
}
    
// Output =>

// Inside Constructor: Q13@372f7a8d
// Inside Member Function: Q13@372f7a8d

