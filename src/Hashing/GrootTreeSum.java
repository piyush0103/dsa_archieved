package Hashing;

import java.util.HashMap;

public class GrootTreeSum {
	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 0 };

		int sum = findSum(arr.length, 1, arr);
		System.out.println(sum);

	}

	private static int findSum(int length, int k, int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> mapTree = new HashMap<Integer, Integer>();
		int sum = 0; int flag=-1;
		for (int i = 0; i < length; i++) {
			if (mapTree.containsKey(arr[i])) {
				mapTree.put(arr[i], mapTree.get(arr[i]) + 1);

			} else {
				mapTree.put(arr[i], 1);
				
			}
			if (mapTree.get(arr[i]) == k) {
				sum += arr[i];
			flag=1;
			}
			else if(mapTree.get(arr[i]) > k) {
				flag=-1;
			}
		}

		return flag>-1?sum:flag;
	}
}
