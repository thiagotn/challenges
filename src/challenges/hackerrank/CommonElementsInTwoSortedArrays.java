package challenges.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInTwoSortedArrays {

	public static void main(String[] args) {
		Integer[] a = {1,3,4,6,7,9};
		Integer[] b = {1,2,4,5,9,10};
		Integer result[] = common_elemens(a, b);
		System.out.println(Arrays.toString(result));
		// result must be: [1,4,9]

		Integer[] array1B = {1, 2, 9, 10, 11, 12};
        Integer[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        Integer resultb[] = common_elemens(array1B, array2B);
        System.out.println(Arrays.toString(resultb));
		// result must be: [1, 2, 9, 10, 12]
	}

	private static Integer[] common_elemens(Integer[] a, Integer[] b) {
		List<Integer> aList = Arrays.asList(a);
		List<Integer> bList = Arrays.asList(b);
		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < aList.size(); i++) {
			Integer item = aList.get(i);
			if (bList.contains(item)) {
				result.add(item);
			}
		}
		Integer[] resultArray = new Integer[result.size()];
 		return result.toArray(resultArray);
	} 
}
