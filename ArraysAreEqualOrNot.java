package Basic;

import java.util.Arrays;

public class ArraysAreEqualOrNot {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };
		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("not equal");
		}
// =================================================================================

		boolean status = true;
		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;
				}
			}

		} else {
			status = false;
		}
		if (status = true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}
	}

}
