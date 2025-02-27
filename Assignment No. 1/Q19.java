// 19. Write a java program to implement abstract class and abstract method. 
// -->

// Abstract class
abstract class One {
    // Abstract method declaration
    abstract void display();

    void show() {
        System.out.println("Show Method inside Abstract class");
    }
}

class Two extends One {
    // Abstract method defination
    void display() {
        System.out.println("Abstract method");
    }
}


class Q19{
    public static void main(String[] args) {
        Two obj = new Two();
        obj.display(); 
        obj.show(); 
    }
}

// Output =>

// Abstract method
// Show Method inside Abstract class
