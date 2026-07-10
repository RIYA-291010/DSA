//MAXIMUM SUMSUBARRAY (KADANE'S ALGORITHM) FOR AN ARRAY WITH EACH ELEMENT AS A NEGATIVE NUMBER
import java.util.*;
public class arr_ii_4 {
    public static void kadanes(int numbers[]){
        int ms=numbers[0];
        int cs=numbers[0];
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            cs=Math.max(cs,numbers[i]);
           
        }
        ms=Math.max(cs,ms);
        
        System.out.println("MAX SUBARRAY SUM="+ms);
    }
    public static void main(String args[]){
        int numbers[]={-1,-2,-3,-4};
        kadanes(numbers);
    }
}
