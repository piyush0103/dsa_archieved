package arrays.subarrays;

public class MaxSubArrays {
	public static void main(String[] args) {
		int arr[] = {-163, -20 };

		int max = maxSubArray(arr);
		System.out.println(max);
	}

	private static int maxSubArray(int[] arr) {
		// TODO Auto-generated method stub
			int max = Integer.MIN_VALUE;
			int ps[] = calculateprefix(arr);
			int len = arr.length;
			int sum = 0;
			for (int i = 0; i < len; i++) {
				for (int j = i; j < len; j++) {
					if (i == j) {
						sum = ps[j];
					} else {
						sum = ps[j] - ps[i];
					}
					max = Math.max(max, sum);
				}
	
			}
	
			return max;
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
