package arrays.subarrays;

public class NoOfSubArrayLessThanB {
	public static void main(String[] args) {
		int arr[] = { 15, 8, 16 };

		int max = maxSubArray(9, 242, arr);
		System.out.println(max);
	}

	private static int maxSubArray(int ja, int B, int[] A) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int ans = 0;
		int len = A.length;
		int sum = 0;
		int j = 0;

		for (int i = 0; i < len; i++) {
			sum += A[i];
			int curr_sum = sum;
			if (curr_sum <= B) {
				System.out.println(curr_sum);
				ans++;
			}
			j = 0;

			while (j < i) {
				curr_sum -= A[j++];
				System.out.println(curr_sum);
				if (curr_sum <= B) {
					ans++;
				}
				
			}
		
		}
		return ans;
	}

}
