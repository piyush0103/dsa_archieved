package arrays.subarrays;

public class SumOfSubArrays {
	public static void main(String[] args) {
		int arr[] = { -163, -20 };

		long max = sumSubArray(arr);
		System.out.println(max);
	}

	private static long sumSubArray(int[] A) {
		int len = A.length;
		long sum = 0L;
		for (int i = 0; i < len; i++) {
			sum += (long) A[i] * (len - i) * (i + 1);
		}
		return sum;

	}
}
