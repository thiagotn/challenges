package challenges.hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	// https://www.hackerrank.com/challenges/diagonal-difference/problem


	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int totalFirstDiagonal = 0;
        int totalSecondDiagonal = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                	totalFirstDiagonal += a[a_i][a_j];
                	totalSecondDiagonal += a[a_i][((n-1) - (a_i))];
                } else if (a_i == 0 && a_j == (n - 1)) {
                	totalSecondDiagonal += a[a_i][((n-1) - (a_i))];
                }
            }
        }
        //System.out.println("First Diagonal is: " + totalFirstDiagonal);
        //System.out.println("Second Diagonal is: " + totalSecondDiagonal);
        System.out.println(Math.abs((totalFirstDiagonal - totalSecondDiagonal)));
    }
}
