//PRINT X TO THE POWER N IN OPTIMZED WAY
import java.util.*;
public class Recursion_10 {
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }else{
            return x*power(x,n/2)*power(x,n/2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF X AND N RESPECTIVELY");
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
    
}
