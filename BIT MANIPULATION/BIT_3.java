//GET THE ith BIT
import java.util.*;
public class BIT_3 {
    public static void get_ith(int n,int i){
        int bit_mask=(1<<i);
        if((n&bit_mask)==0){
            System.out.println("THE VALUE OF BIT AT "+i+ " PLACE IS: 0");
        }else{
            System.out.println("THE VALUE OF BIT AT "+i+" place is 1");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        get_ith(n,i);
    }

    
}
