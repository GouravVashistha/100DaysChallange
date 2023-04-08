package Basic;
import java.util.*;
public class CountNumberofDigitas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// first method
		int len = (int) Math.log10(number);
		System.out.println(len+1);
		
		// second method
		int count=0;
		while(number>0) {
			number= number/10;
			count++;
		}
		System.out.println(count);
		
	}

}
