package strings;

public class PrefixStringArray {
	public static void main(String[] args) {

		String arr[] = { "abab", "ab", "abcd" };

		String prefix = longestPrefix(arr);
		System.out.println(prefix);
	}

	private static String longestPrefix(String[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		int count = 0;
		String init = arr[0];
		String curr_sub = "";
		for (int i = 0; i < len; i++) {
			if (!arr[i].startsWith(init)) {

				init = LongestSubs(init, arr[i]);
			}
			curr_sub=init;
		}

		return curr_sub;
	}

	private static String LongestSubs(String init, String string) {
		// TODO Auto-generated method stub

		int len1 = init.length();
		int len2 = string.length();

		int smallLen = len1 < len2 ? len1 : len2;
		String prefix = "";
		for (int i = 0; i < smallLen; i++) {
			if (init.charAt(i) == string.charAt(i)) {
				prefix += init.charAt(i);
			} else {
				break;
			}

		}

		return prefix;
	}

}
