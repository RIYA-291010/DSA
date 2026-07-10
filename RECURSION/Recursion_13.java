//VERY VERY IMPORTANT GOLDMANN SCAHS
//FRIENDS PAIRING
import java.util.*;
public class Recursion_13 {
    public static int ways(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=ways(n-1);
        //pairing
        int fnm2=ways(n-2);
        int pairs=(n-1)*fnm2;
        int ways=fnm1+pairs;
        return ways;
    }
    public static void main(String args[]){
        System.out.println(ways(3));
    }
    
}
