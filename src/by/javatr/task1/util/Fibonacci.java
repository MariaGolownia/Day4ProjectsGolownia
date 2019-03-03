package by.javatr.task1.util;

public class Fibonacci {

	public static int fibonacci(int n)  {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static Boolean isFibonacciNumber(int n)  {
		long square = n * n;
		double one = Math.sqrt((5 * square) + 4); // (1 + кв.кор.из5)/2 - золотое сечение
		double two = Math.sqrt((5 * square) - 4); // Thus if n is a Fibonacci number, either 5n2 + 4 or 5n2 - 4 is a square. 
		if (one % 1 == 0 || two % 1 == 0) {
			return true;
		}
		else {
			return false;}
	}

}
