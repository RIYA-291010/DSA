//LEXICOGRAPHICAL CONCEPT IN STRINGS
//code to get the largest string among given list of fruits
import java.util.*;
public class STR8{
    public static void main(String args[]){
        String fruits[]={"apple","banana","pineapple","mango","orange"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println("The largest String is: "+largest);
    }
}
