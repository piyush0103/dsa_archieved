package arrays.subarrays;

public class SumLeastSubArrayPrefix {
	public static void main(String[] args) {
		int arr[] = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19 };
		int max = leastSubArray(arr, 1);
		System.out.println(max);
	}

	private static int leastSubArray(int[] A, int B) {
		// TODO Auto-generated method stub
		float sum = 0;
		int index = 0;
		float minSum = Float.MAX_VALUE;
		int ps[] = calculateprefix(A);
		int count = 0;
		for (int i = 0; i <= A.length - B; i++) {
			count = i;
			System.out.print(i + " " + (i + B) + "         ");
//			sum += A[count++];
			if (i == 0) {
				sum = ps[i + B - 1];
			} else {
				sum = ps[i + B - 1] - ps[i-1];
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

	private static int[] calculateprefix(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		int ps[] = new int[len];

		for (int i = 0; i < len; i++) {
			if (i == 0) {
				ps[i] = arr[i];
			} else {
				ps[i] = arr[i] + ps[i - 1];
			}
		}

		return ps;
	}

}