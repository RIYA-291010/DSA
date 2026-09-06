//NEXT GREATER ELEMENT OF ANY ELEMENT IN THE ARRAY TOWARDS ITS RIGHT
import java.util.*;
public class Stack_8 {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGr[]=new int[arr.length];
        //right-backward loop
        for(int i=arr.length-1;i>=0;i--){
            //step 1-while condition
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //step2-if else 
            if(s.isEmpty()){
                nextGr[i]=-1;
            }else{
                nextGr[i]=arr[s.peek()];
            }
            //step3-push
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(nextGr[i]+" ");
        }
    }
    
}
