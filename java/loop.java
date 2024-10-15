import java.util.*;
/**
 * loop
 */
class A{
    Scanner sc = new Scanner(System.in);
    int n;
    void loop(){
        int rev =0;
     System.out.println("Enter the number: ");
     n = sc.nextInt();
     do{
        rev = (rev * 10) + n % 10;
        n = n/10;

     }while(n>0);

     System.out.println("your reverse value : " + rev);

}
}


class loop{
    public static void main(String[] args) {
        A a = new A();
        a.loop();

}
}