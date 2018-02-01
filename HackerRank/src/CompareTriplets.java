import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class CompareTriplets {
	
	static final int SCORE_NUM = 3;

    static int[] solve(int[] aScores, int[] bScores){

        int aResult = 0;
        int bResult = 0;
        
        for(int i = 0; i < aScores.length; i++ ) {
	        if(aScores[i] > bScores[i]) {
	        	aResult++;
	        }
	        else if(aScores[i] < bScores[i]) {
	        	bResult++;
	        }
        }

        int[] score = new int[] {aResult, bResult};
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Enter aScores values.
        int[] aScores = new int[SCORE_NUM];
        for(int aS_i = 0; aS_i < aScores.length; aS_i++) {
        	aScores[aS_i] = in.nextInt();
        }
        // Enter bScores values.
        int[] bScores = new int[SCORE_NUM];
        for(int bS_i = 0; bS_i < bScores.length; bS_i++) {
        	bScores[bS_i] = in.nextInt();
        }
        in.close();

        // Calculate and print result
        int[] result = solve(aScores, bScores);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}