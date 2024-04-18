package arrays.prefixsum;

import java.util.ArrayList;

public class Min_OPeration {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 3, 2 };

		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i : arr) {
			arrList.add(i);
		}
		int ans = solve(arrList);
		System.out.println(ans);
	}

	private static int solve(ArrayList<Integer> arrList) {
		// TODO Auto-generated method stub

		Integer arr[] = arrList.toArray(new Integer[0]);
		int len = arr.length;
		int smallest = 0;
		int max=Integer.MIN_VALUE;
		int prefix_sum[] = new int[len];
		
		for (int i = 1; i < len; i++) {
			if(i==0) {
				prefix_sum[0]=arr[0];
			}else {
			prefix_sum[i] =prefix_sum[i-1]+ arr[i];
			}
			if (max<  arr[i]) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < len; i++) {
			smallest+=max-arr[i];
		}
		

		return smallest;
	}
}
