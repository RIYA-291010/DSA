//Search an element from the matrix
import java.util.*;
public class arr2D_2{
    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("ELEMENT FOUND AT CELL: ["+i+"] ["+j+"]");
                    return true;
                }
            }
        }
        System.out.println("ELEMENT NOT FOUND!");
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=3,c=3;
        int matrix[][]=new int[r][c];
        //take user input
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMEMT TO BE FOUND IN THE MATRIX:");
        int key=sc.nextInt();
        search(matrix,key);
    }
    
}
