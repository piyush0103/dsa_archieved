package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SimilarElementMinimumDistance {
	public static void main(String[] args) {
		int arr[] = { 7, 1, 3, 4, 1, 7 };

		int ans = findMinPair(arr);
		System.out.println(ans);
	}

	private static int findMinPair(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		int min_len = Integer.MAX_VALUE;
		int le1n =min_len;
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();

		for (int i = 0; i < len; i++) {

			if(set.containsKey(arr[i])) {
				le1n=i-set.get(arr[i]);
				System.err.println(le1n);
			}else {
			set.put(arr[i],i);
			}
			if (min_len > le1n) {
				
				min_len = le1n;
				System.out.println("here"+ min_len);
			}

		}

		return min_len != Integer.MAX_VALUE ? min_len : 0;
	}
}
