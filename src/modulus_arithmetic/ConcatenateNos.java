package modulus_arithmetic;

import java.util.Arrays;

public class ConcatenateNos {
	public static void main(String[] args) {
		int min = solve(30, 10, 20 );
		System.out.println(min);
	}

	private static int solve(int i, int j, int k) {
		// TODO Auto-generated method stub

		String arr[] = Arrays.stream(new int[] { i, j, k }).mapToObj(String::valueOf).toArray(String[]::new);

		Arrays.sort(arr);

		String sum = "";
		for (String a : arr) {
			sum += a;
		}

		return Integer.parseInt(sum);
	}
}
