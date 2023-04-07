package Basic;

public class ReverseTheNumber {
// three ways  for reverse string
	public static void main(String[] args) {
		int a = 1234;
		int rev = 0;
   // using algo
		while (a != 0) {
			rev = rev * 10 + a % 10; //
			a = a /10 ;
		}
		System.out.println(rev);
  // using stringBuffer method
		StringBuffer sv = new StringBuffer(String.valueOf(a));
		System.out.println(sv.reverse());
		
  // using stringBuilder
		
		StringBuilder sb =  new StringBuilder();
		sb.append(a);
		System.out.println(sb.reverse());
		
	}

}
