//PRINT x TO THE POWER n
import java.util.*;
public class Recursion_9 {
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER VALUE OF X");
        int x=sc.nextInt();
        System.out.println("ENTER VALUE OF N");
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
    
}
