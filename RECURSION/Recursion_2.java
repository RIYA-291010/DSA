//PRINT ALL THE NUMBERS FROM 1 to n IN INCREASING ORDER
import java.util.*;
public class Recursion_2{
    public static void printNI(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNI(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNI(n);
    }
    
}
