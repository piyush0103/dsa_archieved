package modulus_arithmetic;

public class LCM2Num {
	public static void main(String[] args) {
		int ans = solve(9, 6);
		System.out.println(ans);
	}

	private static int solve(int i, int j) {
		// TODO Auto-generated method stub

		int gcd = findGCD(i, j);
		System.out.println(gcd);
		return i * j / gcd;
	}

	private static int findGCD(int i, int j) {
		// TODO Auto-generated method stub
		{
			if (j == 0)
				return i;
			return findGCD(j, i % j);
		}
	}
}
