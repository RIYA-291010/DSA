//Insertion sort
import java.util.*;
public class Insertion_sort{
    public static void insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            //postion find
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insert
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertion(arr);
        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}