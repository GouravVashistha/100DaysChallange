package Basic;

public class SumOfTheNumber {

	public static void main(String[] args) {
		int number =59;
		int rem =0;
		int sum = 0;
		while(number>0) {
			rem=number%10;
			number = number/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}

}
