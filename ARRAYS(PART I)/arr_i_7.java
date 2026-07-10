//BINARY SEARCH
import java.util.*;
public class arr_i_7 {
    //function to perform binary search
    public static int binarySearch(int numbers[], int key){
        int start=0;  //start at index=0
        int end=numbers.length-1;   //end at index=(n-1)
        while(start<=end){
            int mid=(start+end)/2;

            //comparison
            if(numbers[mid]==key){   //found key
                return mid;
            }
            if(numbers[mid]<key){     //Right half
                start=mid+1;
            }else{
                end=mid-1;    //left half
            }
        }return -1;
    }
    //MAIN FUNCTION
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        System.out.println("Index for the given key "+key+ " is:" +binarySearch(numbers,key));
    }
}
