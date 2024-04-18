package sorting_problems;

import java.util.Arrays;

public class CostofRemoving {
	public static void main(String[] args) {
		int arr[] = { 8, 0, 10 };

		int cost = costOfRemoving(arr);
		System.out.println(cost);

	}

	private static int costOfRemoving(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int len = arr.length;
		int cost = 0;
		for (int i = len - 1; i >= 0; i--) {
			cost+=(len-i)*arr[i];

		}

		return cost;
	}
}
