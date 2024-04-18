package bit_manipulation;

public class NoOfBits {
	public static void main(String[] args) {
		int A = 11;
		int ans = numSetBits(A);
		System.out.println(ans);

	}

	private static int numSetBits(int A) {
		// TODO Auto-generated method stub
		int remainder = A;
		int count = 0;
		while (remainder != 0) {
			if (remainder % 2 != 0) {
				count++;
			}

			remainder = remainder / 2;
		}

		return count;
	}
}
