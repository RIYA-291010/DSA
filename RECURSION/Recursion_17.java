//PRACTICE Q3
//PRINT THE LENGTH OF THE STRING 
import java.util.*;
public class Recursion_17{
    public static int lengthStr(String str,int i){
        if(i==str.length()){
            return 0;
        }
        
        
        return 1+lengthStr(str,i+1);
    }
    public static void main(String args[]){
        String str="abcd";
        System.out.println(lengthStr(str,0));
    }
    
}
