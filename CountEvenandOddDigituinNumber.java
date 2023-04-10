package Basic;
import java.util.*;
public class CountEvenandOddDigituinNumber {

	public static void main(String[] args) {
		int odd =0;
		int even = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = sc.nextInt();
		int rem=0;
		
		while(number>0) {
		rem = number%10; // getting last digit in the number
		
		if (rem % 2 == 0) {
			even++;
		} else {
			odd++;
		}
		number= number/10; // for removing on charter from last
		}
		System.out.println("odd = "+ odd+ " even = "+ even);
	}
	
}
