package Basic;

public class OddEvenInArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		// check for even number
		System.out.println("even number");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		
		// check for odd number
		System.out.println("odd number");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
//		System.out.println( "even");
//		for(int value:a) {
//			if(value%2==0) {
//				System.out.println(value);
//			}
//		}
//		
//		
//		System.out.println("odd");
//		for(int value:a) {
//			if(value%2!=0) {
//				System.out.println(value);
//			}
//		}

	}

}
