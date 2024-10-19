import java.util.*;

class C {
    // Constructor of class C
    C() {
        System.out.println("SUPER KEYWORD");
    }
}

class A extends C {
    int a, b;

    // Constructor of class A, which calls the constructor of class C
    A(int a, int b) {
        super();  // Correct use of super() to call the constructor of class C
        this.a = a;
        this.b = b;
        System.out.println("a = " + a + " b = " + b);
    }
}

class B extends A {
    int c;
    int a = 57 ;
    int b = 2;
    int d ;
    

    // Constructor of class B, which calls the constructor of class A
    B(int a, int b) {
        super(a, b);  // Calling the constructor of class A
        this.c = super.a + super.b;  // Using the values from class A
        System.out.println("sum = " + this.c);

        
        this.d = this.a * this.b;
        System.out.println("multiplication= "+this.d);
    }
}

public class supeer {
    public static void main(String[] args) {
        // Creating a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user for the first integer input
        System.out.println("Enter the 1st value: ");
        int m = sc.nextInt();
        
        // Prompting the user for the second integer input
        System.out.println("Enter the 2nd value: ");
        int n = sc.nextInt();
        
        // Creating an object of class B and passing the input values
        B b = new B(m, n);
    }
}
