package Recursion;

public class SumOfElementInArrays {

	public static void main(String[] args) {
		int a[] = { 12, 3, 43, 5, 6 };
		int sum = 0;
		int secondsum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		
		// By using enhansment Loop
		
		for(int value:a) {
			secondsum = secondsum+ value;
		}
		System.out.println(secondsum);
	}

}
