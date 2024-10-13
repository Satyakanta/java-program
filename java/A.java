import java.util.*;

class A {
    int a; // Instance variable
    static int b = 20; // Static variable
     
    void display(int x) {
        this.a = x; 
        int var = 22; // Local variable
        System.out.println("Value of local var is: " + var); 
        System.out.println("Static Value of b is: " + b); 
        System.out.println("Value of instance variable a is: " + this.a); 
    }

    public static void main(String a[]) {
        A aa = new A();
         
        aa.display(10); 
        A.b = 25;  //OVERRIDE
        System.out.println("STATIC:" +A.b); 
    }
}


