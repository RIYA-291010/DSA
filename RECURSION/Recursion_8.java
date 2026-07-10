//PRINT THE LAST OCCURENCE OF THE ELEMENT IN THE GIVEN ARRAY
import java.util.*;
public class Recursion_8 {
    public static int lastOccur(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccur(arr,key,i-1);
    }
    public static void main(String args[]){
        int arr[]={5,5,5,5};
        System.out.println(lastOccur(arr,5,arr.length-1));
    }
    
}
