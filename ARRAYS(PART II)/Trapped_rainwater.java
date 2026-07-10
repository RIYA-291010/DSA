//FIND THE TRAPPED RAINWATER (AUXILLIARY ARRAYS,TWO POINTER APPROACH)
import java.util.*;
public class Trapped_rainwater{
    //function to calculate trapped rainwater
    public static int trappedwater(int arr[]){
         int n=arr.length;

        //left auxiliary array
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }

        //right auxiliary array
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        //calculate trapped rainwater
        int tw=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            tw+=waterlevel-arr[i];
        }
        return tw;


    }

    public static void main(String args[]){
        int bar[]={4,2,0,6,3,2,5};
        System.out.println("TRAPPED RAINWATER: "+trappedwater(bar));
    }
}