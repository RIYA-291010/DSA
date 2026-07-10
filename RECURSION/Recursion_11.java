//TILING PROBLEM

import java.util.*;
public class Recursion_11 {
    public static int Tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        //for horizontal(n-1) and for vertical (n-2) ways
        return Tiling(n-1)+Tiling(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Tiling(n));
        
    }
    
}
