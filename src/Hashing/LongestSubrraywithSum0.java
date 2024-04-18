package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubrraywithSum0 {
	public static void main(String[] args) {
		int[] arr = { -1, 20, 7, -22, 1, 21, 5, 24, -26, -16, -4, -9, 19, 8, -27, 28, 9, 8, -29, 29, 8, 9, 17, -28, 13,
				20, -1, -8, -16 };

		ArrayList<Integer> arr2 = lszero(arr);
		System.out.println(arr2);
	}

	private static ArrayList<Integer> lszero(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		ArrayList<Integer> prefixSet = findLongestArray(arr, len);

		return prefixSet;
	}

	private static ArrayList<Integer> findLongestArray(int[] arr, int len) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> prefix = new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		int sum = 0;
		int max_len = Integer.MIN_VALUE;
		int sublen = 0;
		int start = 0, end = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
			if (sum == 0) {
				System.out.println(i + " zero");
				sublen = i + 1;

			} else if (prefix.containsKey(sum)) {
				sublen = i - prefix.get(sum);

			} else {
				prefix.put(sum, i);
			}
			if (max_len < sublen) {
				max_len = sublen;
				if (sum == 0) {
					start = -1;
					end = i;
				} else {
					start = prefix.get(sum) + 1;
					end = i;
				}
			}
		}
		for (int i = start + 1; i <= end; i++) {
			ans.add(arr[i]);
		}
		return ans;
	}
}
