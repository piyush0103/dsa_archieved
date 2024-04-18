package modulus_arithmetic;

public class MissingNoAlgorithm1 {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 1, 2, 4, 7 };
		int miss[] = findMissRepeat(arr);
		for (int a : miss) {
			System.out.print(a + " xx");
		}
	}

	private static int[] findMissRepeat(int A[]) {
		// TODO Auto-generated method stub
		int n = A.length;
		int[] output = new int[2];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[A[i] - 1]++;
			System.out.println(A[i] + "ss");
			System.out.println(c[A[i] - 1]);
		}
		for (int j = 0; j < n; j++) {
			if (c[j] != 1) {
				if (c[j] == 2)
					output[0] = j + 1;
				else if (c[j] == 0)
					output[1] = j + 1;
			}
		}
		return output;
	}
}
