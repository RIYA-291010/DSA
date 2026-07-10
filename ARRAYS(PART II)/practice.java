//kadanes
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;

            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println(maxsum);
    }
}*/


//kadanes for all negative numbers
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        int arr[]={-6,-2,-3,-4,-5};
        int cs=0;;
        int ms;
        ms=arr[0];
        for(int i=1;i<arr.length;i++){
            cs=cs+arr[i];
            
            ms=Math.max(ms,cs);
        }
        System.out.println(ms);
    }
}*/

//Trapped rainwater(auxiliary arrays)
/* 
import java.util.*;
public class practice{
    public static int trapped_rainwater(int arr[],int w){
        int n=arr.length;
        //left array
        int left[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }

        //right array
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        //calculate trapped water
        int tw=0;
        for(int i=0;i<n;i++){
            int wl=Math.min(left[i],right[i]);
            tw+=wl-arr[i];
        }
        int ans=tw*w;
        return ans;
    }
    public static void main(String args[]){
        int bar[]={2,6,8,0,1,5};
        int width=2;
        System.out.println("TRAPPED RAINWATER= "+trapped_rainwater(bar,width));

    }
}*/


//maximum profit
import java.util.*;
public class practice{
    public static int maximum_profit(int arr[]){
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                bp=arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int stocks[]={7,1,5,3,6,4};
        System.out.println("MAXIMUM PROFIT IS : "+maximum_profit(stocks));
    }
}