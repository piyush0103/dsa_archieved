package arrays.subarrays;

public class MaxSubArrayLessThanBLessTime {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 4, 5, 5, 5, 7, 5 };

		int max = maxSubArray(9, 14, arr);
		System.out.println(max);
	}

	private static int maxSubArray(int A, int B, int[] C) {
		// TODO Auto-generated method stub
	int max = Integer.MIN_VALUE;
	int ans=0;
	int len = A;
	int sum = 0;
	int j=0;
	for(int i=0;i<len;i++) {
		sum+=C[i];
		if(sum>B) {
		
			while(sum>B) {
				sum=sum-C[j++];
				System.out.println(sum);
			}
			
		}
		if(sum<=B) {
			max=Math.max(sum,max);
			ans=max;
		}
	}
return (max==Integer.MIN_VALUE)?0:ans;
}

}
//		int ans = Integer.MIN_VALUE;
//		int curr_sum = 0;
//		int j = 0;
//		for (int i = 0; i < A; i++) {
//			curr_sum += C[i];
//			if (curr_sum > B) {
//				while (curr_sum > B) {
//					curr_sum = curr_sum - C[j];
//					j++;
//				}
//			}
//			if (curr_sum <= B)
//				ans = Math.max(ans, curr_sum);
//		}
//		return (ans == Integer.MIN_VALUE) ? 0 : ans;
//	}
//}
