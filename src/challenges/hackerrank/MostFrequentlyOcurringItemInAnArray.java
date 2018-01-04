package challenges.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostFrequentlyOcurringItemInAnArray {

	static int most_frequent(int given_array[]) {
		Integer result = null;
		Arrays.sort(given_array);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < given_array.length; i++) {
			if (map.containsKey(given_array[i])) {
				map.put(given_array[i], (map.get(given_array[i]) + 1));
			} else  {
				map.put(given_array[i], 1);			
			}
		}
		Entry<Integer, Integer> entry = map.entrySet().stream()
			.sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
			.findFirst().get();
		
		//System.out.println("The key " + entry.getKey() + " appears " + entry.getValue() + " times.");
		return entry.getKey();
	}
	
	/* 
	 	Example of input:
	
		6
		1 3 1 3 2 1

		Where 6 is the size of array.
		And 1 3 1 3 2 1 are the elements of the array.
		
		Example of output:
	
		1
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		System.out.println(most_frequent(numbers));
	}
}
