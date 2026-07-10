//PRINT ALL THE NUMBERS FROM n to 1 IN DECREASING ORDER USING RECURSION
import java.util.*;
public class Recursion_1{
    public static void printNo(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNo(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printNo(n);
    }
}