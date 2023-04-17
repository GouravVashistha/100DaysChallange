package Basic;

import java.util.Arrays;

public class SearchElementInArrayUsingBinaryAlgorithum {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Appraoch 1 : logic 
		boolean flag = false;
		int key = 9;
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			// divide array into two part
			int m = (l + h) / 2;
			// case 1
			if (a[m] == key) {
				System.out.println("Element found  at index number:" + m);
				flag = true;
				break;
			}
			// case 2
			if (a[m] < key) {
				l = m + 1;
			}
			// case 3
			if (a[m] > key) {
				h = m - 1;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

		
		// Appraoch 2
		
		System.out.println(Arrays.binarySearch(a, 7));
		
	}

}
