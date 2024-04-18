package arrays.prefixsum;

import java.util.ArrayList;

public class ArrayOddEven {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 6, 4 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int a : arr) {
			list.add(a);
		}
		int equilibrium_index = solve(list);
		System.out.println(equilibrium_index);
	}

	private static int solve(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int count = 0;
		Integer arr[] = list.toArray(new Integer[0]);
		int len = arr.length;
		Integer pse[] = calculatePrefixEvenSumArray(arr, len);
		Integer pso[] = calculatePrefixOddSumArray(arr, len);
		int sum_even = 0, sum_odd = 0;
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				sum_even = pso[len - 1];
				sum_odd = pse[len - 1] - pse[i];
			} else {
				sum_even = pse[i - 1] + pso[len - 1] - pso[i];
				sum_odd = pso[i - 1] + pse[len - 1] - pse[i];

			}
			if (sum_even == sum_odd) {
				count++;
			}
		}

		return count;
	}

	private static Integer[] calculatePrefixOddSumArray(Integer[] arr, int length) {
		// TODO Auto-generated method stub
		Integer pso[] = new Integer[length];
		pso[0] = 0;
		for (int i = 1; i < length; i++) {
			if (i % 2 == 0) {
				pso[i] = pso[i - 1];

			} else {

				pso[i] = pso[i - 1] + arr[i];
			}
		}

		System.out.println("printing prefix sum array odd");
		for (int a : pso) {
			System.out.print(a + " * ");
		}
		System.out.println();
		return pso;
	}

	private static Integer[] calculatePrefixEvenSumArray(Integer[] arr, int length) {
		// TODO Auto-generated method stub

		Integer pse[] = new Integer[length];
		pse[0] = arr[0];
		for (int i = 1; i < length; i++) {
			if (i % 2 == 0) {
				pse[i] = pse[i - 1] + arr[i];

			} else {
				pse[i] = pse[i - 1];
			}
		}

		System.out.println("printing prefix sum array even");
		for (int a : pse) {
			System.out.print(a + " * ");
		}
		System.out.println();
		return pse;
	}
}
