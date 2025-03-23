// 16. Write a java program to implements all types of inheritance.
// -->

// Single Inheritance
class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.show();
        System.out.println("This is Child class");
    }
}

public class Single {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

// Output =>
// This is the Parent class
// This is Child class


// Multilevel Inheritance
class One {
    int a = 10;
}

class Two extends One {
     int b = 20;
}

class Three extends Two {
    void add() {
        System.out.println("Addition: " + (a + b));
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.add();
    }
}

// Output =>
// Addition: 30


// Hierarchical Inheritance
class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child1 extends Parent {
    void showChild1() {
        System.out.println("This is Child1 class");
    }
}

class Child2 extends Parent {
    void showChild2() {
        System.out.println("This is Child2 class");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.show();
        obj1.showChild1();

        obj2.show();
        obj2.showChild2();
    }
}

// Output =>
// This is the Parent class
// This is Child1 class
// This is the Parent class
// This is Child2 class


// Hybrid Inheritance 
class A { 
    int a = 10, b = 5; 
} 
 
class B extends A { 
    void sub() { 
        System.out.println("subtraction is: " + (a - b)); 
    } 
} 
 
class C extends A { 
    int z = 5; 
} 
 
class D extends C { 
    void add() { 
        System.out.println("addition is: " + (a + b + z)); 
    } 
} 

public class Hybrid {
    public static void main(String args[]) { 
        B m = new B(); 
        m.sub(); 
        D n = new D(); 
        n.add(); 
    }
}

// Output => 
// subtraction is: 5
// addition is: 20


// Multiple Inheritance
interface One {
    void method1();
}

interface Two {
    void method2();
}

class  Access implements One, Two {
    public void method1() {
        System.out.println("Method from Interface One");
    }

    public void method2() {
        System.out.println("Method from Interface Two");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Access obj = new Access();
        obj.method1();
        obj.method2();
    }
}

// Output =>
// Method from Interface One
// Method from Interface Two
