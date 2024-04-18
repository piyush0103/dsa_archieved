package strings;

public class ReverseWordStr {
	public static void main(String[] args) {
		String str = "the sky is blue hell baby marry free chi shopulkdnf";

		String revStr = ReverseAWord(str);

		System.out.println(revStr);
	}

	private static String ReverseAWord(String str) {
		// TODO Auto-generated method stub
		// reverse a wholeString

		char arr[] = str.toCharArray();

		int start = 0, end = arr.length - 1;

		Reverse(start, end, arr);
		// now reversing each word
		int len = arr.length;
		int begin = 0;
		int end1 = 0;
		for (int i = 0; i < len; i++) {
			char c = arr[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				begin = i;
				char e = c;
				for (end1 = i; end1 < len; end1++) {
					e = arr[end1];
					if ((e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z') || (e >= '0' && e <= '9')) {
						i = end1;
						continue;
					} else {
						end1 = end1 - 1;
						i = end1;
						break;
					}
				}
				if (end1 > begin) {
					if (end1 == len) {
						end1 = end1 - 1;
					}
					Reverse(begin, end1, arr);
				}
			}

		}

		return new String(arr);
	}

	private static void Reverse(int start, int end, char[] arr) {
		// TODO Auto-generated method stub

		while (start < end) {
			swap(start, end, arr);
			start++;
			end--;

		}
	}

	private static void swap(int start, int end, char[] arr) {
		// TODO Auto-generated method stub
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
