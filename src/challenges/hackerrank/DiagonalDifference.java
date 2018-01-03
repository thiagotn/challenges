package challenges.hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	// https://www.hackerrank.com/challenges/diagonal-difference/problem
    static int diagonalDifference(int[][] a) {
        // Complete this function
    	int result = 0;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;        
        for (int i = 0; i < a.length; i++) {
        	sumDiagonal1 += a[i][i];
        	sumDiagonal2 += a[i][(a.length - 1) - i];
        }
    	result = Math.abs((sumDiagonal1 - sumDiagonal2));
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
        	for(int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
