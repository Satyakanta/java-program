// Title: Simple Addition Program in Java using this keyword  (remove confusion between local and instance and constructor called itself using this)
//call to this must be first statement in constructor
import java.util.*;

public class thi {
    
    public static void main(String[] args) {
        // Creating a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user for the first integer input
        System.out.println("Enter 1st value: ");
        int n = sc.nextInt();
        
        // Prompting the user for the second integer input
        System.out.println("Enter 2nd value: ");
        int m = sc.nextInt();
        
        // Creating an object of class A and passing the input values
        A aa = new A(n , m);
        
        // Calling the show method to display the result
        aa.show();
    }
}

class A {
    int a, b;
    
    // Default constructor that prints a message when called
    A() {
        /*this(6 , 7);*/  // This comment is retained as per your request
        System.out.println("_____Your Addition Program_____");
    }
    
    // Parameterized constructor to initialize the variables a and b
    A(int a, int b) {
        this(); // Calling the default constructor
        this.a = a;
        this.b = b;
    }
    
    // Method to calculate and display the sum of a and b
    void show() {
        int c = this.a + this.b;
        System.out.println("a = " + this.a + " b = " + this.b);
        System.out.println("Your addition of two numbers: " + c);
    }
}
