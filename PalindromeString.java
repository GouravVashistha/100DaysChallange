package Basic;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chars = str.toCharArray();
		String orgstr = str;
		String rev = "";
		for(int i=chars.length-1;i>=0;i--) {
			rev+=chars[i];
		}
		System.out.println(rev);
		
		if(rev.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not");
		}
	}

}
