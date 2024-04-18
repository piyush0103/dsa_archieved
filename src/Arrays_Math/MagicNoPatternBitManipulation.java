package Arrays_Math;

public class MagicNoPatternBitManipulation {
	public static void main(String[] args) {
		int x = solve(16);
		System.out.println(x);
	}

	private static int solve(int i) {
		// TODO Auto-generated method stub
		int limit = (int) (int) (Math.log(i) / Math.log(2));
		int power = 5;
		int count = 0;
		int sum = 0;
		while (count <= limit + 1) {
//			System.out.println((i >> count & 1));
			if (((i >> count & 1) == 1)) {
				sum += 1 * power;
			}

			power *= 5;
			count++;
		}

		return sum;
	}
}
