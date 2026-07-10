//PRINT THE SUM OF FIRST N NATURAL NUMBERS USING RECURSION
import java.util.*;
public class Recursion_4{
    public static int SumN(int n){
        if(n==0){
            return 0;
        }
        return n+SumN(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SumN(n));
    }
}
