package arrays.subarrays;

import java.util.ArrayList;

public class AlternatingSubarrays {
	public static void main(String[] args) {
		int arr[] = {  0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0 };
		int ans[] = solve(arr, 30);

	}

	private static int[] solve(int[] A, int B) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listIndex = new ArrayList<Integer>();
		int indilen = 2 * B + 1;
		int count = 0;
		int len = A.length;
		int j = 0;
		j = indilen / 2;
		for (int i = 0; i < len; i++) {
			if (indilen == 1) {
				listIndex.add(i);
			}

			else {

				int start = i;
				int end = i + indilen - 1;
//				System.out.println(end + "-----");
				if (end >= len) {
					break;
				}
				int center = (start + end) / 2;
//				System.out.println(center + "******");
				if (checkAlternate(start, center, end, A)) {
					System.out.println("coming");
					listIndex.add(center);
				}
			}
		}
		int ans[] = new int[listIndex.size()];
		for (int a : listIndex) {
			ans[count++] = a;
		}
		System.out.println(listIndex);
		return ans;

	}

	private static boolean checkAlternate(int start, int center, int end, int arr[]) {
		// TODO Auto-generated method stub
		boolean alternate = false;
		while (start != end) {
			if ((end - start + 1) % 2 == 0) {
				if (arr[start] == arr[end]) {
					return alternate;
				}

			} else if ((end - start + 1) % 2 != 0) {
				System.out.println(start + " " + end + " " + arr[start] + " " + arr[end]);

				if (arr[start] != arr[end]) {
					return alternate;
				}

			}
			if (arr[start] == arr[start + 1] || arr[end - 1] == arr[end]) {
				return alternate;
			}
			
			start++;
			end--;
		}
		System.out.println(alternate);
		alternate=true;
		return alternate;
	}
}
