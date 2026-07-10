//ARRAYS AS FUNCTION ARGUEMENTS
//PASSING ARRAYS AS ARGUEMENTS
import java.util.*;
public class arr_i_3{
    //  passing array as an arguement in the function
    public static void updatearr(int marks[]){
        for(int i=0;i<marks.length;i++){
         marks[i]=marks[i]+1;
        }
        
    }

    //main function
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //define array
        int marks[]=new int[5];
        //INPUT MARKS IN THE ARRAY
        System.out.println("ENTER THE MARKS WITHIN THE ARRAY:");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        

        //output from the array
        System.out.println("THE ORIGINAL MARKS ARE:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"");
        }System.out.println();

        //call function to get updated marks 
        updatearr(marks);

        System.out.println("THE UPDATED MARKS ARE:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"");
        }System.out.println();


    }
}