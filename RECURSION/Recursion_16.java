//PRACTICE Q2
//PRINT 1234 AS ONE TWO THREE FOUR
import java.util.*;
public class Recursion_16 {
    public static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printStr(int n){
        if(n==0){
            return;
        }
        int ld=n%10;
        printStr(n/10);
        System.out.print(digits[ld]+" ");
    }
    public static void main(String args[]){
        printStr(12345);
    }
    
}
