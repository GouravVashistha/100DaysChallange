package Basic;

import java.util.Arrays;

public class SortElementInArrayInBubbleSort {

	public static void main(String[] args) {
		int a[] = { 20, 13, 55, 64, 44, 98, 52 };
		// Appraoch 1
		/*
		 * Arrays.sort(a); for(int i = 0;i<=a.length-1;i++) { System.out.println(a[i]);
		 * }
		 */

		// Appraoch 2
		System.out.println("Arrays Element before sorted :" + Arrays.toString(a));
		int n = a.length;
		for (int i = 0; i <= n - 1; i++) { // number of passes
			for (int j = 0; j < n - 1; j++) { // Iteration for each pass
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Array Element after Sorting  :" + Arrays.toString(a));

	}

}
