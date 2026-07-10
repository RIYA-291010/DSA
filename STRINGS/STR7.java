//CODE TO PRINT THE AUBSTRING OF ANY STRING
import java.util.*;
public class STR7{
    public static String Substring(String str,int si, int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        String Str="Hello World! I am RIYA,learning DSA.";
        System.out.println(Substring(Str,0,9));
    }
}