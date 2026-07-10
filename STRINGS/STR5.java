//Check if a string is a palindrome or not
import java.util.*;
public class STR5{
    public static void check_palindrome(String str){
        int n=str.length();
        int flag = 0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                flag=1;
            }else{
                flag=0;
            }
        }
        
        if(flag==1){
            System.out.println(str+" IS A PALINDROME");
        }else{
            System.out.println(str+" IS NOT A PALINDROME");
        }

    }
    public static void main(String args[]){
        String str1="racecar";
        String str2="racpar";
        String str3="madam";
        String str4="noon";
        

        //function call-check
        check_palindrome(str1);
        check_palindrome(str2);
        check_palindrome(str3);
        check_palindrome(str4);
        

    }
}