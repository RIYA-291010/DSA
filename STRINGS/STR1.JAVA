//CREATION,DECLARATION,INPUT AND OUTPUT IN A STRING
import java.util.*;
public class STR1{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        char arr[]={'a','b','c','d'};//character array
        String str="abcd";  //string created directly
        String str2=new String("xyz");  //string created using new keyword
        String name=sc.next();  //string containing only single word input
        String name2=sc.nextLine();  //string having complete sentence across multiple lines with spaces as well 
        //output
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(name);
        System.out.println(name2);
    }
}