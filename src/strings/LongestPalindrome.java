package strings;

public class LongestPalindrome {
	public static void main(String[] args) {

		String str = "a";

		String len = findLongestPalindrome(str);
		System.out.println(len);
	}

	private static String findLongestPalindrome(String str) {
		// TODO Auto-generated method stub
	
		char arr[] = str.toCharArray();
		int len = arr.length;
		int left = 0;
		int right = 0;
		int count = 0;
		String ansodd = "";
		String anseven = "";
		int max_len = Integer.MIN_VALUE;
		int max_len_even = Integer.MIN_VALUE;
		for (int i = 0; i < len ; i++) {
			left = i;
			right = i;
			count = 0;
			while (left >= 0 && right < len) {
				if (arr[left] == arr[right]) {
					count = right - left + 1;
					if (max_len < count) {
						max_len = count;
						System.out.println(left+" ---- "+right);
						ansodd = str.substring(left, right + 1);

					}

				} else {

					break;

				}

//				System.out.println(left + "ddddd");

				left--;
				right++;
			}

			count = 0;
			left = i - 1;
			right = i;
			count = 0;
			while (left >= 0 && right < len) {
				if (arr[left] == arr[right]) {
					count = right - left + 1;
					if (max_len_even < count) {
						max_len_even = count;
						System.out.println(left+" --+-- "+right);

						anseven = str.substring(left, right+1);

					}

				} else {
					break;

				}

				left--;
				right++;
			}

		}

		return max_len > max_len_even ? ansodd : anseven;

	}
}