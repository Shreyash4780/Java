// 18. Write a java program to override method.
// -->


class One {
    void show() {
        System.out.println("1st class show");
    }
}

class Two extends One {
    void show() {
        super.show();
        System.out.println("2nd class show");
    }
}

class Q18 {
    public static void main(String[] args) {
        // One obj1 = new One();
        // obj1.show(); 
        
        Two obj2 = new Two();
        obj2.show(); 
    }
}


// Output =>

// 1st class show
// 2nd class show