//MAXIMUM SUBARRAY SUM(PREFIX ARRAY)
import java.util.*;
public class arr_ii_2 {
    //function to calculate maxsubarrsum
    public static void maxSubarrSum(int numbers[]){
        //initialize variables
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;  //-infinity
        //prefix array
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        //calculate current sum using nested loops
        //outer loop
        for(int i=0;i<numbers.length;i++){
            int start=i;
            //inner loop
            for(int j=i;j<numbers.length;j++){
                int end=j;
                //currsum
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                //comparison
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("THE MAXIMUM SUBARRAY SUM="+maxsum);

        
    }
    //main function
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxSubarrSum(numbers);
    }
    
}
