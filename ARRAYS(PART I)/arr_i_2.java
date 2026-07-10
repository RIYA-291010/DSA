//INPUT,OUTPUT AND UPDATE IN AN ARRAY
import java.util.*;
public class arr_i_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //create an array
        int marks[]= new int[100];

        //TAKING INPUT FOR THE ARRAY

        System.out.println("ENTER THE MARKS FOR PHYSICS:");
        marks[0]=sc.nextInt();
        System.out.println("ENTER THE MARKS FOR CHEMISTRY:");
        marks[1]=sc.nextInt();
        System.out.println("ENTER THE MARKS FOR MATHS:");
        marks[2]=sc.nextInt();


        //GETTING OUTPUT FROM THE ARRAY
        System.out.println("Physics marks:"+marks[0]);
        System.out.println("Chemistry marks:"+marks[1]);
        System.out.println("Mathematics marks:"+marks[2]);

        //UPDATE AN ARRAY
        marks[2]=marks[2]+1;
        System.out.println("Updated Mathematics marks:"+marks[2]);

        //LENGTH OF AN ARRAY
        System.out.println("Length of the arrays marks="+marks.length);



    }
    
}
