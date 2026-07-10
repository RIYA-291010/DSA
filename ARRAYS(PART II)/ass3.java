//code to get maximum profit
import java.util.*;
public class ass3{
    //function to gget maximum profit
    public static int max_profit(int arr[]){
        int bp=Integer.MAX_VALUE;
        int mp=0;
        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                mp=Math.max(mp,profit);
            }else{
                bp=arr[i];

            }
        }
        if(mp>0){
            return mp;
        }else{
            return 0;
        }
    }
    //main function
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("MAXIMUM PROFIT: "+max_profit(prices));
    }
    
}
