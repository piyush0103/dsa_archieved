package modulus_arithmetic;

import java.util.Arrays;

public class RepeatingElement2 {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 1, 2, 4, 7 };
		int miss[] = findMissRepeat(arr);
		for (int a : miss) {
			System.out.print(a + " xx");
		}
	}

	private static int[] findMissRepeat(int[] A) {
		// TODO Auto-generated method stub

		// Length of the array, n
		// Repeating element, x
		// Missing element, y
		int n = A.length, x = 0, y = 0, sum = 0;

		// Copying the List A to another array list, since “final List” can’t be
		// modified
		int array[] = Arrays.copyOf(A, n);

		// iterating through each element in A
		for (int i = 0; i < n; i++) {
			int element = A[i];

			// XORing each element and store in sum variable
			sum ^= element;

			// XORing sum with number from 1 to n
			sum ^= (i + 1);

			// index = position - 1
			int index = element - 1;

			// if the index was made negative previously,
			// the second time around the element will be made positive
			if (array[index] < 0) {
				x = element;
			}

			// making each visiting element negative
			array[index] = -array[index];
		}

// XORing the resulting sum with repeating element to find the missing element
		y = sum ^ x;

// returning x and y by initializing it with x and y
		return new int[] {x,y};
	}
}
