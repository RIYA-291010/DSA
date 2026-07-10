//PRINT SUBARRAYS FROM AN ARRAY
import java.util.*;
public class arr_i_10 {
    public static void subarr(int numbers[]){
        int ts=0;  // total no. of subarrays
        //3 nested loops will be used
        //outer loop
        for(int i=0;i<numbers.length;i++){
            int start=i;
            //inner loop 1
            for(int j=i;j<numbers.length;j++){
                int end=j;
                //inner loop 2
                for(int k=start;k<=end;k++){ 
                    System.out.print(numbers[k]+" ");
                }ts++;
                System.out.println();
            }System.out.println();
        }System.out.println("THE TOTAL NUMBER OF SUBARRAYS= "+ts);
    }
    //main function
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        subarr(numbers);

    }

    
}
