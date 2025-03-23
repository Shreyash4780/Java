// 17. Write a java program to stop inheritance. 
// -->

final class One {
    void show() {
        System.out.println("This is a final class and cannot be inherited.");
    }
}

// The following will cause an error because One is final
// class Two extends Base { } // ERROR: Cannot inherit from final class

public class Q17 {
    public static void main(String[] args) {
        One obj = new One();
        obj.show();
    }
}

// Output =>
// This is a final class and cannot be inherited.
