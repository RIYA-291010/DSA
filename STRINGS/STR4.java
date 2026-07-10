//write a function to print all the characters of any string
import java.util.*;
public class STR4{
    public static void print_characters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String first_name="Riya";
        String last_name="Chaudhary";
        print_characters(first_name);
        print_characters(last_name);
    }
}