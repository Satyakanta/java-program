import java.util.*;
/**
 * loop
 */
class A{
    Scanner sc = new Scanner(System.in);
    int n;
    void loop(){
        int fac =1;
     System.out.println("Enter the number: ");
     n = sc.nextInt();
     do{
        fac = fac * n;
        n--;

     }while(n>0);

     System.out.println("factorial : " + fac);

}
}


class loop{
    public static void main(String[] args) {
        A a = new A();
        a.loop();

}
}