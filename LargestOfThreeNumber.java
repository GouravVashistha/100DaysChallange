package Basic;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		int a = 4, b = 1, c = 31;
  // using if else conditiom
		if (a > b && a > c) {
			System.out.println("a is Greater");
		} else if (b > c && b > a) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
  // using ternerory operator
		int variable = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max :"+ variable);
	}

}
