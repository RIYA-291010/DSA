//assignment ques1
// //return true if an array contains any value atleast twice otherwise return false
import java.util.*;
public class ass1{
    public static boolean showresult(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();    
        }
        System.out.println(showresult(nums));
    }
    
}
