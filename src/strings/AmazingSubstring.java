package strings;

public class AmazingSubstring {
	public static void main(String[] args) {
		String str = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
		int no_of_subs = findSubs(str);
		System.out.println(no_of_subs);
	}

	private static int findSubs(String str) {
		// TODO Auto-generated method stub
		char arr[] = str.toCharArray();
		int len = arr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {

				count += (len - i);
			}
		}
		System.out.println(count % 10003 + "  sdf  " + String.valueOf(count));
		System.out.println();
		int ans = calculateModulus(count, 10003);
		return ans;
	}

	private static int calculateModulus(int count, int j) {
		// TODO Auto-generated method stub

		String str = String.valueOf(count);
		int len = str.length();
		int r = 0;
		for (int i = 0; i < len; i++) {
			r = ((int) str.charAt(i) - '0' % j + r * 10) % j;
		}

		return r;
	}
}

//
//char[] chars = str.toCharArray();
//int count = 0;
//for(int i=0; i<chars.length; i++){
//char temp = Character.toUpperCase(chars[i]);
//
//if(temp=='A' || temp=='E'|| temp=='I' || temp=='O' || temp=='U'){
//
//count+=(chars.length-i);
//}
//}
//return count;
//}
//}
