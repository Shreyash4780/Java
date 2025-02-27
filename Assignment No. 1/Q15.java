// 15. Write a java program to demonstrate user defined package. 
// -->

import mypackage.MyClass;

public class Q15 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}

// Output =>

// Hello from MyClass inside mypackage