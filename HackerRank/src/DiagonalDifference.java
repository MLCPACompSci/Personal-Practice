import java.util.*;
import java.io.*;
import java.math.*;

public class DiagonalDifference {
    
	public static int[][] getMatrix(Scanner input) {
		int matrixDimension = input.nextInt();
	       int[][] valueMatrix = new int [matrixDimension] [matrixDimension]; 
	       for(int i = 0; i < matrixDimension; i++) {
	    	   for(int j = 0; j < matrixDimension; j++) {
	    		   valueMatrix [i][j] = input.nextInt();
	    	   }
	       }
	    return valueMatrix;
	}
	public static int[] diag1(int[][] matrix){
    	int[]diag = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			diag[i] = matrix[i][i];
		}
    	return diag;
    }
    public static int[] diag2(int[][] matrix){
    	int[]diag = new int[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			diag[i] = matrix[i][(matrix.length - i) - 1];
		}
    	return diag;
    }
    
    public static int sum(int[] Value){
        int sum = 0;
        for(int i = 0; i < Value.length; i++){
            sum += Value[i];
        }
        return sum;
    }
    public static int difference(int num1, int num2) {
    	return (Math.abs(num1 - num2));
    }
    
    public static void printValue(int[][] matrix){
    	for(int j = 0; j < matrix.length; j++) {
     	   for(int i = 0; i < matrix[j].length; i++) {
     		   System.out.print(matrix[j][i] + " ");
     	   }
     	   System.out.println();
        }
    }
	public static void printValue(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int[][] matrix = getMatrix(input);
       input.close();
       int[] diag1 = diag1(matrix);
       int[] diag2 = diag2(matrix);
       int sum1 = sum(diag1);
       int sum2 = sum(diag2);
       int difference = difference(sum1, sum2);
       
       System.out.println(difference);
    }
}