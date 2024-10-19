import java.util.*;
public class pat2 {
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

        B bb = new B();
        bb.show(m);

        C cc = new C();
        cc.show(m);

        D dd = new D();
        dd.show(m);
    
}
}




    class A {
        int a;
        
        
        void display(int x) {
            a = x;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    System.out.print("# ");
                }
                for (int j = a; j >= i; j--) {
                    System.out.print("& ");
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
            for (int j = 1; j <= b; j++) {
               if (i==1 || i==b || j==1 || j==b) {
                System.out.print("* ");
               }
               else{
                System.out.print("- ");
               }
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
            for (int j = 1; j <= i; j++) {
               if (i==1  || i==c || j==1 || j==i) {
                System.out.print("* ");
               }
               else{
                System.out.print("- ");
               }
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
            for (int j = 1; j <= d; j++) {
                 if(count<10){
                    System.out.print("0"+count++ +" ");
                 }
                 else{
                    System.out.print(count++ +" ");
                
                 }
                
            }
            System.out.println();
        }
    }
}