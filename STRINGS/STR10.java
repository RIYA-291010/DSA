//Convert the first letter of each word to upper case
import java.util.*;
public class STR10{
    public static String toUpper(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(i<str.length()&& str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="hi, i am riya, currently learning strings concept";
        System.out.println(toUpper(str));
    }
}