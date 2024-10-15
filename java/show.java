import java.util.*;
class A{
    Scanner sc = new Scanner(System.in);
    int a;
    void fac(){
        System.out.println("Enter your value:");
        a = sc.nextInt();
        if (a==0){
            System.out.println("FACTORIAL VALUE CONNOT BE 0");

        }
        else if (a>0) {

            int fac = 1;
            while (a>0) {
                fac = fac * a;
                a--;
            }
            System.out.println("YOUR FAC VALUE:"+fac);
        }
        else {
            System.out.println("you cannot put the operator");

        }
    }
}








class show{
    public static void main(String[] args) {
        A a = new A();
        a.fac();


    }
}