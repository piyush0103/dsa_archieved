package problem_solving;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(isPrime(a));

	}

	private static String isPrime(int a) {

		if (a <= 1) {
			return "NO";
		} else if (a == 2) {
			return "YES";
		} else if (a % 2 == 0) {
			return "NO";
		}

		for (int i = 3; i <= Math.sqrt(a); i += 2) {
			if (a % i == 0) {
				return "NO";
			}

		}
		
		return "YES";
	}
}
