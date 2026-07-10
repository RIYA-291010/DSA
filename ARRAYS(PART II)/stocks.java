import java.util.*;
public class stocks{
    public static int buyandsellstocks(int prices[]){
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;
        //check for each day
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit=prices[i]-bp; //calculate profit
                maxprofit=Math.max(maxprofit,profit);  //calculate maximm profit
            }else{
                bp=prices[i];  //if it is getting loss then today's price is bp or we can say that today we are buying the stock
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("THE MAXIMUM PROFIT IS "+buyandsellstocks(prices));
    }
    
}
