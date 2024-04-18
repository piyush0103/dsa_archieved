package arrays;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		String elem = "";
		String arr_len = "";
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			sc.nextLine();
			arr_len = sc.nextLine();
			elem = sc.next();

			int selem = Integer.parseInt(elem);
			String sarr[] = arr_len.trim().split("\\s+");
			int len = Integer.parseInt(sarr[0]);
			int arr[] = new int[sarr.length - 1];

			for (int j = 1; j < sarr.length - 1; j++) {
				arr[j - 1] = Integer.parseInt(sarr[j]);
			}

			findelem(arr, selem);
		}
		sc.close();

//		System.out.println(elem + " " + arr_len);

	}

	private static void findelem(int[] arr, int selem) {
		// TODO Auto-generated method stub
		byte found = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == selem) {
				found = 1;
			}
		}
		System.out.println(found);
	}
}
