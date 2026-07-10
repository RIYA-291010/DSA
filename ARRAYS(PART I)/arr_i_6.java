//THE SMALLEST NUMBER WITHIN THE ARRAY(LINEAR SEARCH)
import java.util.*;
public class arr_i_6 {
    //function to get the smallest number in the array
    public static int getSmallestNumber(int numbers[]){
        int smallest=Integer.MAX_VALUE;   //+ infinity
        for(int i=0;i<numbers.length;i++){
          if(numbers[i]<smallest){
            smallest=numbers[i];
           }
        }return smallest;
    }

    //main function
    public static void main(String args[]){
        int numbers[]={9,5,2,8,7};

        //call function and get the smallest number within the array as the output
        System.out.println("THE SMALLEST NUMBER WITHIN THE ARRAY IS: "+getSmallestNumber(numbers));
    }
    
}
