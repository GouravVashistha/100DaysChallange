package Basic;

import java.util.Arrays;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int a[]= {12,2,3,4,5,59,7,8,9};
		Arrays.sort(a);
		System.out.println("MIN: "+ a[0]+" MAX: "+a[a.length-1]);
	}

}
