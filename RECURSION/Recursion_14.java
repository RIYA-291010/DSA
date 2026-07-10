//PRINT THE BINARY STRINGS OF N SIZE WITHOUT CONSECUTIVE ONES
import java.util.*;
public class Recursion_14{
    public static void printBinStr(int n, int lp, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam recursive function
        printBinStr(n-1,0,str+"0");
        if(lp==0){
            printBinStr(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        printBinStr(3,0,(""));
    }
    
}
