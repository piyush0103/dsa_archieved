package bit_manipulation;

public class UnSetNBits {
	public static void main(String[] args) {
		long ans = Solve(75411, 11);
		System.out.println(ans);

	}

	private static long Solve(long A, int B) {
		// TODO Auto-generated method stub

		String binary = toBinary(A, B);

		long decimal = toDecimal(binary);
		return decimal;
	}

	private static long toDecimal(String binary) {
		// TODO Auto-generated method stub
		char at[] = binary.toCharArray();
		int arr[] = new int[at.length];
		int len = at.length;
		String rev = "";
		int count = 0;
		for (int j = len - 1; j >= 0; j--) {
			rev += at[j];
			arr[count++] = at[j];
		}

		long n = Long.valueOf(rev);
		int base = 1;
		long sum = 0;
		long last = 0;
		while (n > 0) {
			last = n % 10;
//			System.out.print(last + " ");
			n = n / 10;
			sum += last * base;
			base = base * 2;

		}

//		System.out.println(sum);
		return sum;
	}

	private static String toBinary(long A, int B) {
		// TODO Auto-generated method stub
		int arrBinary[] = new int[32];
		String binary = "";
		int count = 0;
		while (A > 0) {
			count++;
			if (count <= B) {
//				System.out.println(count);
				binary += (0 & (A % 2));
			} else {
				binary += A % 2;
			}
			A = A / 2;
		}
//System.out.println(binary);
		return binary;
	}
}
