import java.util.*;
public class array {
    public static void main(String[] args) {
        
    

        
        A aa = new A();
        aa.input();


    }
}

/**
 * Innerarray
 */
class A {
    Scanner sc = new Scanner(System.in);
    int sum =0;

    void input(){
        
        System.out.println("enter the size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value " + i +" :" );
            a[i] = sc.nextInt();
            
        }
        System.out.println("your array : ");
        for (int i = 0; i<n; i++) {
            
            System.out.print(a[i] + " ");
            System.out.println(" ");
            
        }
        System.out.println("sum of array element");
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            
            }
            System.out.print(sum + " ");
            System.out.println(" ");



        



    }


    
}
