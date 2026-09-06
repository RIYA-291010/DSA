//implemetation of stack using JCF
import java.util.*;
public class Stack_3 {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
