package Recursion;
import java.util.*;
public class FibonacciNumberRecursion {

	public int Fibonacci(int n) {
		if(n<0) {
			return -1;
		}
		
		if(n==0 || n==1){
			return n;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		FibonacciNumberRecursion fn = new FibonacciNumberRecursion();
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fn.Fibonacci(a));
		sc.close();

	}

}
