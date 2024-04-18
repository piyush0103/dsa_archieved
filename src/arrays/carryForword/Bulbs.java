package arrays.carryForword;

import java.util.ArrayList;

public class Bulbs {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 0, 0, 1, 1, 0, 0, 1 };
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		for (int a : arr) {
			arr1.add(a);
		}
		int len = solve(arr1);
		System.out.println(len + "answer");
	}

	private static int solve(ArrayList<Integer> arr12) {
		// TODO Auto-generated method stub
		int switch_pressed = 0;
		Integer[] arr = arr12.toArray(new Integer[0]);
		int len = arr.length;
		int currentvalue = 0;
		for (int i = 0; i < len; i++) {
			if (switch_pressed % 2 == 0) {
				currentvalue = arr[i];
			} else {
				if (arr[i] == 0) {
					currentvalue = 1;
				} else {
					currentvalue = 0;
				}
			}

			if (currentvalue == 0) {
				switch_pressed++;
			}

		}

		return switch_pressed;
	}
}
