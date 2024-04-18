package sorting_problems;

public class SortingZeroesAndOne {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 0, 1, 0, 2, 2, 1, 1, 2, 1, 0, 2, 2, 0, 1, 1, 0, 2, 1, 0, 0, 0, 2, 2, 1, 1, 0, 0, 1, 2, 2,
				1, 2, 2, 0, 0, 2, 0, 0, 0, 2, 2, 0, 1, 0, 0, 2, 2, 1, 0, 1, 0, 0, 2, 2, 0, 0, 0, 0, 1, 2, 0, 2, 0, 2 };
		int n = arr.length;

		sortZerosAndOne(arr);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	private static void sortZerosAndOne(int arr[]) {
		// TODO Auto-generated method stub
		int currIndex = 0;
		int len = arr.length;
		int temp = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				temp = arr[currIndex];
				arr[currIndex] = arr[i];
				arr[i] = temp;
				currIndex++;
			}
		}
		int start = currIndex;
		for (int j = currIndex; j < len; j++) {
			if (arr[j] == 1) {
				temp = arr[currIndex];
				arr[currIndex] = arr[j];
				arr[j] = temp;
				currIndex++;
			}
		}

	}
}
