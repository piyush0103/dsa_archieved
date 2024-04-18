package problem_solving;

import java.util.Scanner;

public class PrimeOrNotRecursion {
	static int d=2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(isPrime(a));

	}

	private static String isPrime(int a) {

	if(a==1 || a==0) {
		return "NO";
	}
	if(a==d) {
		return"YES";
	}
	if(a%d==0) {
		return"NO";
	}
	d++;
	return isPrime(a);
}
}