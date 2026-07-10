//LARGEST NUMBER WITHIN THE ARRAY(LINEAR SEARCH)
import java.util.*;
public class arr_i_5 {
    //function to get the largest number 
    public static int getLargestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
                
            }
        }return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,4,7,8,9};
        

        //function call and get the output
        
        System.out.println("THE LARGEST NUMBER WITHIN THE ARRAY IS: "+getLargestNumber(numbers));

    }
    
}
