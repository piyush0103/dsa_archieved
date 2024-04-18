package arrays.subarrays;

public class SumLeastSubArray {
	public static void main(String[] args) {

		int arr[] = { 3, 16, 11, 13, 19, 17, 11, 4, 9, 9, 6, 7, 3, 6, 12, 3, 4, 15, 5, 19 };
		int max = maxSubArray(arr, 1);
		System.out.println(max);
	}

	private static int maxSubArray(int[] A, int B) {
		// TODO Auto-generated method stub
		float sum = 0;
		int index = 0;
		float minSum = Float.MAX_VALUE;
		int count = 0;
		for (int i = 0; i <= A.length - B; i++) {
			count = i;
			System.out.print(i + " " + (i + B) + "         ");
			while (count < i + B) {
				sum += A[count++];
			}
			sum = sum / B;
			System.out.print(sum + " s");
			if (sum < minSum) {
				minSum = sum;

				index = i;
			}
			sum = 0;
			System.out.println();

		}
		return index;
	}

}
