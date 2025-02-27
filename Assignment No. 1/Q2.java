// 2.Write a Java program to demonstrate local, instance and static variables.
// -->

class Q2 {
        int instanceVar = 10;   // Instance var
        
        static int staticVar = 20;   // Static var
     
        void showVar() {
            int localVar = 30; // Local var
    
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Static Variable: " + staticVar);
            System.out.println("Local Variable: " + localVar);
        }
    
        public static void main(String[] args) {
            Q2 obj = new Q2();
            obj.showVar();
        }
        
}

// Output =>

// Instance Variable: 10
// Static Variable: 20
// Local Variable: 30