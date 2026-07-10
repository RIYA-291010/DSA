//MAXIMUM SUBARRAY SUM(BRUTE FORCE)
import java.util.*;
public class arr_ii_1{
    //function to calculate max subarrsum
    public static void maxsubarrsum(int numbers[]){
        int max_sum=Integer.MIN_VALUE;   //initialize maxsubarray sum as -infinity
        int curr_sum=0;   //initialize current subarray sum as 0
        //3 nested loops will be used
        //outer loop for every current number
        for(int i=0;i<numbers.length;i++){
            int start=i;

            //inner loop 1
            for(int j=i;j<numbers.length;j++){
                int end=j;
                curr_sum=0;

                //inner loop 2
                for(int k=start;k<=end;k++){
                    curr_sum+=numbers[k];
                }
                System.out.println(curr_sum);
                //compare max_sum and current sum
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }

            }
        }
        System.out.println("THE MAXIMUM SUBARRAY SUM="+max_sum);
    }
    //main function
    public static void main(String args[]){
        int numbers[]={1,2,-5,-8,9};
        maxsubarrsum(numbers);
    }
}