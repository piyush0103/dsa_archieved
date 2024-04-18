package arrays.subarrays;

public class MaxSubarraylesstime {
	public static void main(String[] args) {

		int arr[] = { -163, -20 };
		int max = maxSubArray(arr);
		System.out.println(max);
	}

	private static int maxSubArray(int[] A) {
		// TODO Auto-generated method stub
		int sum =0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++){
		sum+=A[i];
		if(sum>maxSum){
		maxSum = sum;
		}
		if(sum<0){
		sum=0;
		}
		}
		return maxSum;
		}
		}