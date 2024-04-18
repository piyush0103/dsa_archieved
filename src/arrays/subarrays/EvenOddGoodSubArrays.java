package arrays.subarrays;

public class EvenOddGoodSubArrays {
	public static void main(String[] args) {

		int arr[] = { 3, 12, 11, 11, 11, 15 };

		int max = maxSubArray(9, 12, arr);
		System.out.println(max);
	}

	private static int maxSubArray(int ja, int B, int[] A) {
		// TODO Auto-generated method stub
//		int max = Integer.MIN_VALUE;
		int ans = 0;
		int len = A.length;
		int sum = 0;
		int j = 0;
		int index = 0;
		for (int i = 0; i < len; i++) {
			sum += A[i];
			int curr_sum = sum;
			index = i - 0 + 1;
			j = 0;

			while (j <= i) {
//				System.out.println(index + " == " + sum);
				if (curr_sum < B) {
					if (index % 2 == 0) {
//						System.out.println(curr_sum + "e");
						ans++;
					}

				} else if (curr_sum > B) {
										if (index % 2 != 0) {
//						System.out.println(curr_sum);
						ans++;
					}

				}
				curr_sum = curr_sum - A[j];

				index = i - j;
//				System.out.println(curr_sum+"  "+index+" "+j+" "+i);


				j++;



			}
		}
		return ans;
	}

}
