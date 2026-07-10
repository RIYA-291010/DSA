//find the largest and the smallest element from the matrix
import java.util.*;
public class arr2D_3{
    public static void largest_and_smallest(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("THE LARGEST ELEMENT IN THE ARRAY IS: "+largest);
        System.out.println("THE SMALLEST ELEMENT IN THE ARRAY IS : "+smallest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=3,c=3;
        int matrix[][]=new int[r][c];
        //take user input
        System.out.println("ENTER ELEMENTS OF THE MATRIX:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        largest_and_smallest(matrix);
    }
    
}
