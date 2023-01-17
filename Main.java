import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    
    public static int[][] create2DArrayWithRandomValue(int noOfRows, int noOfColumns)
    {
        Random random = new Random();
        int matrix[][] = new int[noOfRows][noOfColumns];
        for(int i=0;i<noOfRows;i++)
            for(int j=0;j<noOfColumns;j++){
                matrix[i][j] = random.nextInt(100-0)+0;
            }
        
        return matrix;
    }
    
    public static int[][] sortColWise(int[][] matrix, int col){
        int[][] mat = matrix;
        for(int j=0;j<mat[0].length;j++){
            if(j==col){
                int[] colArr = new int[mat.length];
                for(int i=0;i<mat.length;i++) colArr[i] = mat[i][j];
                int[] sortedCol = sortTheCol(colArr);
                for(int i=0;i<colArr.length;i++){
                    mat[i][j] = sortedCol[i];
                }
            }
        }
        return mat;
    }
    
    public static int[] sortTheCol(int[] arr){
        Arrays.sort(arr); //  Arrays.sort() uses Quick sort so complexity will be O(nlogn)
        // sort(arr);
        return arr;
    }
    
    // Implemented the sorting  
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swapping arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
      }
      //this sorts in O(n^2)
    }
    
    public static void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }    
        
    }
    
	public static void main (String[] args) {
	    int row = 5;
	    int col = 4;
	    
	    int[][] mat = create2DArrayWithRandomValue(row,col);
	    display(mat);
	    
	    
	   int[][] ans = sortColWise(mat,3);
	    display(ans);
	}
}