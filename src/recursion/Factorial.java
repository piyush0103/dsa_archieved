package recursion;

public class Factorial {
	static Long factorial(int n) {
		if (n == 1)
			return (long) 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {
		int i;
		Long fact = 0L;
		int number = 150;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}