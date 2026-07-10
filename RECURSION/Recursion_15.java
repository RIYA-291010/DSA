//PRACTICE Q1
//FIND ALL THE OCCURRENCES(INDICES) FOR THE KEY ELEMENT IN THE GIVEN ARRAY
import java.util.*;
public class Recursion_15 {
    public static void idxOccurKey(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        idxOccurKey(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,2,3,5,4,1,2,5};
        idxOccurKey(arr,2,0);
    }
    
}
