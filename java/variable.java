import java.util.*;

class A {
    int a; // Instance variable
    static int b = 20; // Static variable
     
    void display(int x) {
        this.a = x; // Assigning value to instance variable
        int var = 22; // Local variable
        System.out.println("Value of local var is: " + var); // Printing local variable
        System.out.println("Static Value of b is: " + b); // Printing static variable
        System.out.println("Value of instance variable a is: " + this.a); // Printing instance variable
    }

    public static void main(String a[]) {
        A aa = new A(); // Creating an object of class A
        aa.display(10); // Calling display method
    }
}


