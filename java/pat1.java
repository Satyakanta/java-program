import java.util.*;

public class pat1 {
    public static void main(String a[]) {
        int m;
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE: ");
        
        // Taking input from the user
        m = sc.nextInt();
        
        // Creating object of class A and calling its display method
        A aa = new A();
        aa.display(m);
        
        // Creating object of class B and calling its show method
        B bb = new B();
        bb.show(m);
        
        // Creating object of class C and calling its show method
        C cc = new C();
        cc.show(m);
        
        // Creating object of class D and calling its show method
        D dd = new D();
        dd.show(m);
    }
}

class A {
    int a;
    
    // Method to display a pattern where each row contains the row number repeated
    void display(int x) {
        a = x;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class B {
    int b;
    
    // Method to display a pattern where each row contains numbers from 1 to the row number
    void show(int y) {
        b = y;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class C {
    int c;
    
    // Method to display a pattern where each row starts from 'c' and decreases down to the current row number
    void show(int y) {
        c = y;
        for (int i = 1; i <= c; i++) {
            for (int j = c; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class D {
    int d;
    
    // Method to display a pattern where numbers increment consecutively across the rows
    void show(int y) {
        d = y;
        int count = 1;
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}