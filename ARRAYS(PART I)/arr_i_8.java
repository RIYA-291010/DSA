//REVERSE AN ARRAY
import java.util.*;
public class arr_i_8 {
    //function to reverse an array
    public static void reverseArray(int numbers[]){
        int first=0;   //start at index=0
        int last=numbers.length-1;  //ends at index=(n-1)
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;  //increase first index by 1;
            last--;   //decrease last index by 1;
        }
    }
    //main function
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        reverseArray(numbers);     //function call
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }System.out.println();

    }
    
}
