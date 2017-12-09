package challenges.hackerrank;

import java.util.Scanner;

public class DigitSum {
	
	// https://www.hackerrank.com/challenges/recursive-digit-sum/problem

	static int superDigit(String n, int k) {
        // Complete this function
		StringBuilder pString = new StringBuilder();
		for (int i = 0; i < k ; i++) {
			pString.append(n);
		}
		Integer result = super_digit(pString.toString());
		while (result > 10) {
			result = super_digit(result.toString());
		}
		return result;
    }

	private static int super_digit(String p) {
		char[] charArray = p.toCharArray();
		int total = 0;
		for (int y = 0; y < charArray.length; y++) {
			int currentValue = Character.getNumericValue(charArray[y]);
			total = (total + currentValue);
		}
		//System.out.println("Super digit of " + Arrays.toString(charArray) + " is " + total);
		return total;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = superDigit(n, k);
        System.out.println(result);
        in.close();
    }
}
