//INVALID PARENTHESIS
import java.util.*;
public class Stack_9 {
    public static boolean isValidParentheses(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
        
         //push opening parentheses in stack
            if(curr=='(' || curr=='{' || curr=='['){
                s.push(curr);
            }
            else{
               //check valid
             if(s.isEmpty()){
                return false;
             }
             char top=s.peek();
             if((top=='('&& curr==')')||(top=='{' && curr=='}') || (top=='['&& curr==']')){
                   s.pop();
                }else{
                    return false;
                }
            }
         
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str="(){}[]";
        System.out.println(isValidParentheses(str));
    }
}
    

