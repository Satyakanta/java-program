import java.util.*;
class A{
    int a , b;
    A(int a , int b ){
        this.a = a ;
        this.b = b ;
        System.out.println("a= "+a+" b= "+b);

    }
}

class B extends A{
    int c ;
    B(int a ,int b  ){ 
        super(a , b);
        this.c = this.a+this.b;
        System.out.println("sum = "+this.c);

    
    }                                                 
}




public class supeer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 1st value: ");
        int m =sc.nextInt();
        System.out.println("enter the 2nd value: ");
        int n =sc.nextInt();
        B b = new B(m , n);



    
}
}