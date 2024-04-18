package Arrays_Math;

import java.util.Arrays;
import java.util.List;

public class N3RepeatingNO {
	public static void main(String[] args) {
		Integer a[] = {1, 2, 3,4, 1, 1,5,6,1,8,8,9,1,45,1 };
		List<Integer> arr = Arrays.asList(a);

		int flag = rePeatedNumber(arr);
		System.out.println(flag);
	}

	private static int rePeatedNumber(List<Integer> arr) {
		// TODO Auto-generated method stub
		int len = arr.size();
		int reqLen = len / 3;
		int firstCandidate = Integer.MIN_VALUE;
		int secondCandidate = Integer.MAX_VALUE;
		int first_Count = 0;
		int second_count = 0;
		int curr_elem = 0;
		for (int i = 0; i < len; i++) {
			curr_elem = arr.get(i);
			if (firstCandidate == curr_elem) {
				first_Count++;
			}
			else if (secondCandidate == curr_elem) {
				second_count++;
			}

			else if (first_Count == 0) {
				firstCandidate = curr_elem;
				first_Count++;
			}

			else if (second_count == 0) {
				secondCandidate = curr_elem;
				second_count++;

			} else {
				first_Count--;
				second_count--;
			}

		}

		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < len; i++) {
			if (firstCandidate == arr.get(i)) {
				count1++;
			}
			if (secondCandidate == arr.get(i)) {
				count2++;
			}

		}
		if (count1 >= reqLen) {
			return firstCandidate;
		}

		if (count2 >= reqLen) {
			return secondCandidate;
		}
		return -1;
	}
}
