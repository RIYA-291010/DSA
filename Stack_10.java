//Duplicate parenthesis
import java.util.*;
public class Stack_10{
    public static boolean DuplicateParenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(ch==')'){
                int count =0;
            
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(DuplicateParenthesis(str1));
        System.out.println(DuplicateParenthesis(str2));
    }
}
