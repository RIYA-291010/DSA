//practice ques 4 code to get rainwater trapped
import java.util.*;
public class ass4{
    public static int trapped_water(int arr[],int w){
        int n=arr.length;
        int tw=0;
        //left array
        int left[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n ;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        //right array
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        //calculate trapped water
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            tw+=(waterlevel-arr[i])*w;
        }
        return tw;

    }
    //main function
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int width=1;
        System.out.println("TRAPPED RAINWATER: "+trapped_water(height,width));
    }
    
}
