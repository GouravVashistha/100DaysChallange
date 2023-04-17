package Basic;

public class SearchinElementInArrayUsingLinerSearch {

	public static void main(String[] args) {
		// let as suppose we have array arr
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int key = 30;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("Element found at index :" + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
