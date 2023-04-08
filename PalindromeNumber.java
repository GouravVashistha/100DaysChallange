package Basic;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgnum = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println(rev);
		if(rev==orgnum) {
			System.out.println("number is Palindrome");
		}else {
			System.out.println("number is not palindrome");
		}

	}

}
