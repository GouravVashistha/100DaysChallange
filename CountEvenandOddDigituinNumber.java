package Basic;
import java.util.*;
public class CountEvenandOddDigituinNumber {

	public static void main(String[] args) {
		int odd =0;
		int even = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = sc.nextInt();
		int sum=0;
		
		while(number>0) {
		sum = number%10;
		number= number/10;
		if (sum % 2 == 0) {
			even++;
		} else {
			odd++;
		}
		}
		System.out.println("odd = "+ odd+ " even = "+ even);
	}
	
}
