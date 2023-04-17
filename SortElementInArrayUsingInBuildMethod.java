package Basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElementInArrayUsingInBuildMethod {

	public static void main(String[] args) {
		int a[] = { 20, 13, 55, 64, 44, 98, 52 };
		
//		System.out.println("Arrays Element before sorted :" + Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array Element after Sorting  :" + Arrays.toString(a));
		
//		System.out.println	("Arrays Element before sorted :" + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array Element after Sorting  :" + Arrays.toString(a));
		
		
		Integer b[] = { 20, 13, 55, 64, 44, 98, 52 };
		System.out.println("Arrays Element before sorted :" + Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Array Element after Sorting  :" + Arrays.toString(b));

	}

}
