package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOddEven {
	public static void main(String[] args) {
		String elem[] = null;
		int arr_len[] = null;

		String sarr[] = null;
		int arr[] = null;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		elem = new String[t];
		arr_len = new int[t];
		sc.nextLine();
		for (int i = 0; i < t; i++) {

			arr_len[i] = sc.nextInt();
			sc.nextLine();
			elem[i] = sc.nextLine();
		}
		sc.close();
		for (int i = 0; i < t; i++) {
			sarr = elem[i].trim().split("\\s+");
			arr = new int[sarr.length];
			for (int j = 0; j < sarr.length; j++) {
				arr[j] = Integer.parseInt(sarr[j]);
			}
			printOddEven(arr, arr_len[i]);
		}

	}

	private static void printOddEven(int[] arr, int length) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list_even = new ArrayList<Integer>();
		ArrayList<Integer> list_odd = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if (arr[i] % 2 == 0) {
				list_even.add(arr[i]);
			}
			if (arr[i] % 2 != 0) {
				list_odd.add(arr[i]);
			}
		}

		for (int a : list_odd) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int a : list_even) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
