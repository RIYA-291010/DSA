//CHECK IF A NUMBER IS ODD OR EVEN
import java.util.*;
public class BIT_2 {
    public static void main(String args[]){
        int n=40;
        int result= (n&1);
        if(result==0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
    }
    
}
