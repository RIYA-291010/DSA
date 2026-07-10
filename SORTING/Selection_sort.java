//CODE FOR SELECTION SORT
import java.util.*;
public class Selection_sort{
    public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                //Ascending order sorting 
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }
    //main 
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        selection_sort(arr);
        //print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}