package arrays;

import java.util.Scanner;

public class ArrayRotateFromStart {
	public static void main(String[] args) {
		System.out.println("eneter lenght of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("eneter no of times rotate array");
		int d = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		System.out.println("array before rotation");

		for (int ds : arr) {
			System.out.print(ds + " ");
		}
		int arrRotated[];
		arrRotated = arrayRotate(arr, n, d);

//arrRotated=arrayRotateByJugglingAlgorithm(arr,n,d);

//		arrRotated = arrayRotateByTempArray(arr, n, d);

		System.out.println("\narray after rotation");

		for (int s : arrRotated) {
			System.out.print(s + " ");
		}
	}

	private static int[] arrayRotateByTempArray(int[] arr, int n, int d) {
		// TODO Auto-generated method stub

//	 we get same array after n rotation
		while (d > n) {
			d = d - n;
		}

		int tempArr[] = new int[d];
		int temp = 0;
// moving the end of array into temporary array
		for (int i = n - d; i < n; i++) {

			tempArr[i - n + d] = arr[i];
		}

		System.out.println("printing array temp");
		for (int k : tempArr) {
			System.out.print("*" + k + " ");
		}
// shfiting rest element 
		for (int i = n - 1; i >= d; i--) {
//	System.out.println(i+"**"+(i+d));

			arr[i] = arr[i - d];

		}
//copying array from temp array

		for (int i = 0; i < tempArr.length; i++) {
			arr[i] = tempArr[i];
		}

		return arr;
	}

//private static int[] arrayRotateByJugglingAlgorithm(int[] arr, int n, int d) {
//	// TODO Auto-generated method stub
//	return null;
//}

	private static int[] arrayRotate(int[] arr, int n, int d) {
		// TODO Auto-generated method stub

		int temp = 0;
		for (int i = 0; i < d; i++) {

			temp = arr[0];

			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];

			}

			arr[n - 1] = temp;
		}

		return arr;
	}

}
