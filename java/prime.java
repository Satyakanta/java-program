import java.util.*;

class A {
    Scanner sc = new Scanner(System.in);

    void prime() {
        System.out.println("Enter a number to check its a prime or not : ");
        int n = sc.nextInt();
        int i;
        int count = 0;
        i = 1;
        while (i <= n) {
            if (n % i == 0) {
                count = count + 1;
            }
            i++;

        }

        if (count == 2) {
            System.out.println("prime");

        } else {
            System.out.println("not prime");

        }

    }
}

public class prime {
    public static void main(String[] args) {
        A aa = new A();
        aa.prime();

    }
}
