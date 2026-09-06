//Reverse a string using Stack
import java.util.*;
public class Stack_5 {
    public static String revString(String str){
        Stack<Character>s=new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="abcdef";
        System.out.print(revString(str));

    }
    
}
