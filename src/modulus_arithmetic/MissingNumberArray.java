package modulus_arithmetic;

import java.util.Arrays;

public class MissingNumberArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 1, 2, 4, 7 };

		int miss[] = findMissingNoArray(arr);
		for (int a : miss) {
			System.out.print(a + " xx");
		}
	}

	private static int[] findMissingNoArray(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int len = arr.length;
		int duplicate = 0;
		int missing = 0;
		int ap = 0;
		byte found = 0;
		Arrays.sort(arr);
		int first = 1;
		int d = 1;
		int k = 0;
		for (int i = 0; i < len; i++) {
			ap = first + i * d;
			System.out.println(k + " xxxx " + arr[k] + " xxxx " + ap + " .||." + i);

//			if (k <len - 1) {
//				System.out.println(k+"          fail");
//				if (arr[k] == arr[k + 1]) {
//					duplicate = arr[k];
//				}
//			}
			if (arr[k] != ap) {
				found = 0;

				if (k == 0 || (k < i)) {
					if (arr[k] == arr[k + 1]) {
						duplicate = arr[k];
					}
				} else {
					if (arr[k] == arr[k - 1]) {

						duplicate = arr[k];
					}
				}
				int j = i;
				while (j < len) {
					if (arr[j] == ap) {
						System.out.println("fjghfj" + " " + arr[j] + " " + ap);
						k = j;
						found = 1;
						break;
					}

					j++;
				}
				if (found == 0) {
//					System.out.println(ap + "+++++++++++++");
					missing = ap;
					k = i-1;
//					System.out.print(missing + "     **");
				}

			}
			

			if (missing != 0 && duplicate != 0) {
				break;
			}

			k++;
			if (k <len - 1) {
				System.out.println(k+"          fail");
				if (arr[k] == arr[k + 1]) {
					duplicate = arr[k];
				}
			}
		}

		return new int[] { duplicate, missing };
	}
}
