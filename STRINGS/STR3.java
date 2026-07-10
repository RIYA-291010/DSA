//STring concatenation and access characters of a string
import java.util.*;
public class STR3{
    public static void main(String args[]){
        String first_name="Riya";
        String last_name="Chaudhary";
        String full_name= first_name+" "+last_name;
        System.out.println(full_name);
        //access character
        //we will use .charAt() method to access the element of any string
        System.out.println(first_name.charAt(0));
        System.out.println(last_name.charAt(5));
        System.out.println(full_name.charAt(10));
    }
}