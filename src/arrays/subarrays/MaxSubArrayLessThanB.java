package arrays.subarrays;

public class MaxSubArrayLessThanB {
	public static void main(String[] args) {
		int arr[] = {7, 1, 8, 5, 8, 5, 3, 3, 5  };

		int max = maxSubArray(9, 78, arr);
		System.out.println(max);
	}

	private static int maxSubArray(int A, int B, int[] C) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int ps[] = calculateprefix(C);
		int len = A;
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (i == 0) {
					sum = ps[j];
				} else {
//						System.out.println(i+"***"+j);
					sum = ps[j] - ps[i - 1];
				}
				if (sum <= B) {
					max=Math.max(sum, max);
					ans = max;
				}

			}

		}

		return ans;
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
