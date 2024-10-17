import java.util.*;

public class pattern2{
    public static void main(String a[]){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE: ");
        m = sc.nextInt();
        A aa = new A();
        aa.show(m);
        aa.dis(m);

    }
    
}


class A{
    
    int a;
    void show(int x){
        int count = 1;
        a=x;
        System.out.println("_____your simpl pattern 1_____ ");
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(count + " ");
                count++;
                
            
            }

            System.out.println();
            
        }
    }


    void dis(int n){
        
        a=n;
        int var = a*a;
        System.out.println("_____your pattern 2_____");
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(var + " ");
                var--;
                
            
            }

            System.out.println();
            
        }
    }


    


    
    }











