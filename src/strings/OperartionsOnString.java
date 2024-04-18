package strings;

public class OperartionsOnString {
	public static void main(String[] args) {
		String str = "lLdfRVCgbkND";

		String ans = performOperations(str);
		System.out.println(ans);

	}

	private static String performOperations(String str) {
		// TODO Auto-generated method stub

//concatenate	

		String str2 = concatenateSelf(str);

		char ch[] = str2.toCharArray();
		int len = ch.length;
		ch = delUppercase(ch, len);
		ch = replaceVowel(ch, len);
		int end = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\0') {
				end = i;
				break;
			}
		}
		return new String(ch, 0, end - 1);
	}

	private static String concatenateSelf(String str) {
		// TODO Auto-generated method stub
		return str + str;
	}

	private static char[] replaceVowel(char[] ch, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < len; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				ch[i] = '#';

			}
		}
		return ch;

	}

	private static char[] delUppercase(char[] ch, int len) {
		int count = 0;
		int j = 0;
		// TODO Auto-generated method stub
		for (int i = j = 0; i < len; i++) {
			if (ch[i] > 64 && ch[i] < 91) {
				count++;

			} else {
				ch[j++] = ch[i];
			}
		}
		while (count > 0) {
			ch[j++] = '\0';
			count--;
		}

//		System.out.println(new String(ch) + "     sdsd");
		return ch;
	}
}
