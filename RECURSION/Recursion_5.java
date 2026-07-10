//PRINT Nth FIBONACCI NUMBERS
import java.util.*;
public class Recursion_5{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER Nth term");
        int n=sc.nextInt();
        System.out.println(fib(n));
    }

    
}
