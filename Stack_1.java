//Implementation of stack using arrayList
import java.util.*;
public class Stack_1{
    public static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();
        //isEmpty function
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push function
        public static void push(int data){
            list.add(data);
        }
        //pop function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}