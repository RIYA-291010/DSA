//PAIRS IN AN ARRAY
import java.util.*;
public class arr_i_9 {
    //function for the pairs in an array
    public static void printpairs(int numbers[]){
        //total pairs
        int tp=0;
        //2 NESTED LOOPS WILL BE USED
        //outer loop
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];   //for every current number this loop will run

           //inner loop
           for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+curr+","+numbers[j]+ ")");
            tp++;
           }
           System.out.println();
        }System.out.println("The total number of pairs is:"+tp);
    }
    //main function
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);   //function call
    }
}
