package bit_manipulation;

import java.util.ArrayList;

public class BinaryStrings {
	public static void main(String[] args) {
		String a = "1010110111001101101000";
		String b = "1000011011000000111100110";

		System.out.println(addBinary(a, b));

	}

	private static String addBinary(String a, String b) {
		// TODO Auto-generated method stub
		int n1 = a.length();
		int n2 = b.length();
		int loop = Math.abs(n1 - n2);
		if (a.length() > b.length()) {
			for (int i = 0; i < loop; i++) {
				b = '0' + b;
			}
		}

		else {
			for (int i = 0; i < loop; i++) {
				a = '0' + a;
			}
		}
		b = '0' + b;
		a = '0' + a;

		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		int size = a1.length;

		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			arr1.add(Character.getNumericValue(a1[i]));
		}

		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			arr2.add(Character.getNumericValue(b1[i]));
		}

//		System.out.println(arr1);
//		System.out.println(arr2);
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int sum = 0;
		for (int i = size - 1; i >= 0; i--) {
//			System.out.println(arr1.get(i) + " " + arr2.get(i));
			sum += arr1.get(i) + arr2.get(i);
			answer.add(sum % 2);
			sum = sum / 2;
		}

		String ans = "";
		for (int bit = size - 1; bit >= 0; bit--) {
			ans += answer.get(bit);
		}
		if(ans.startsWith("0")) {
			ans=ans.substring(1, ans.length());
		}
		return ans;
	}
}
