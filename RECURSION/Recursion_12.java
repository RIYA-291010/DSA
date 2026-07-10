//very very important GOOGLE,MICROSOFT
// //REMOVE DUPLICATES FROM THE STRING
import java.util.*;
public class Recursion_12{
    public static void removeDup(String str,int idx, StringBuilder newStr, boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currchar=str.charAt(idx);
        //charcater already present
        if(map[currchar-'a']==true){
            removeDup(str,idx+1,newStr,map);
        }
        //charcater is not present
        else{
            map[currchar-'a']=true;  //map mein uski value true krdi
            removeDup(str,idx+1,newStr.append(currchar),map); //recursive call lgai new string mein character sppend krne k baad
        }
    }
    public static void main(String args[]){
        String str="appnnacollege";
        removeDup(str,0,new StringBuilder(""),new boolean[26]);
    }
}