import java.util.*;

public class pattern{
    public static void main(String a[]){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE: ");
        m = sc.nextInt();
        A aa = new A();
        aa.show(m);

    }
    
}


class A{
    
    int a;
    void show(int x){
        a=x;
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i+ " ");
                
            
            }

            System.out.println();
            
        }
    }
    


    
    }











