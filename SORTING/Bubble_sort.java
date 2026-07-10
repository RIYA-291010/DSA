//Sort an array using bubble sort
import java.util.*;
public class Bubble_sort{
    //function bubble sort
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                //IN ASCENDING ORDER
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //Main function
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubble_sort(arr);
        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}