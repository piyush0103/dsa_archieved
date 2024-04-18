package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithZero {
	public static void main(String[] args) {
		int[] arr = { 1,2,6,8,11};

		int exist = lszero(arr);
		System.out.println(exist);
	}

	private static int lszero(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		boolean exist = findSubArray(arr, len);

		return exist == true ? 1 : 0;
	}

	private static boolean findSubArray(int[] arr, int len) {
		// TODO Auto-generated method stub

		HashSet<Integer> prefix = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
			if (sum == 0) {
				return true;

			} else if (prefix.contains(sum)) {
				return true;

			} else {
				prefix.add(sum);
			}

		}
		return false;

	}
}