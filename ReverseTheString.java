package Basic;
import java.util.*;
public class ReverseTheString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String value = sc.next();
		 using stringbuffer
		StringBuffer sb = new StringBuffer(value);
		System.out.println(sb.reverse());
		
		// using string Builder
		
		String value1 = sc.next();
		StringBuilder s = new StringBuilder(value1);
		System.out.println(s.reverse());
		
		// using alogrithum
		String newval =sc.next();
		char[] yash = newval.toCharArray();
		
		
		String val="";
		for(int i =yash.length-1; i>=0; i--)
		{
			val+=yash[i];
		}
		System.out.println(val);
		
		
	}

}
