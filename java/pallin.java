import java.util.*;

class A {
    Scanner sc = new Scanner(System.in);

    void p() {

        System.out.println("ENTER A VALUE TO CHECK PALLIN: ");
        int n = sc.nextInt();
        int j, rev = 0;
        j = n;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;

        }
        if (j == rev) {
            System.out.println("it is a pallindrome");

        } else {
            System.out.println("it is not a pallindrome");
        }
    }

}

public class pallin {
    public static void main(String a[]) {
        A obj = new A();
        obj.p();

    }
}
