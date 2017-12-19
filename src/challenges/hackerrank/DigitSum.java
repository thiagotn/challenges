package challenges.hackerrank;

import java.util.Scanner;

public class DigitSum {
	
	// https://www.hackerrank.com/challenges/recursive-digit-sum/problem

	static Long superDigit(String n, int k) {
        // Complete this function
		
		char[] charArray = n.toCharArray();
		//System.out.println("Tamanho de N: " + charArray.length);
		//return (long) charArray.length;
				
		int sizeOfArray = (n.toCharArray().length * k);
		//System.out.println("Tamanho total do array: " + sizeOfArray);
		char[] pArray = new char[sizeOfArray];
		
		
		int count = 0;
		Long sum = 0L;
		for (int i = 0; i < k ; i++) {
			for (int y = 0; y < charArray.length; y++) {
				//System.out.println("Na posição " + count + " o valor é: " + charArray[y]);
				pArray[count] = charArray[y];
				sum = (sum + Character.getNumericValue(charArray[y]));
				count++;
			}
		}

		//System.out.println("Array final: " + Arrays.toString(pArray));

		Long result = super_digit(sum.toString());
		while (result > 10) {
			result = super_digit(result.toString());
		}
		return result;
    }

	private static Long super_digit(String p) {
		char[] charArray = p.toCharArray();
		Long total = 0L;
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
        Long result = superDigit(n, k);
        System.out.println(result);
        in.close();
    }
}
