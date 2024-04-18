package modulus_arithmetic;

public class LongModString {
	public static void main(String[] args) {
		System.out.println(findMod("5", 2));
	}

	private static long findMod(String string, int B) {
		// TODO Auto-generated method stub
		long ans = 0;
		int size = string.length();
        long mod=0;
		for (int i = 0; i < size; i++) {
			
			mod=power(10, size - i - 1, B);
			
			System.out.println(Character.getNumericValue(string.charAt(i))+"   "+mod);

			ans = (ans + (string.charAt(i)-'0') % B * mod) % B;
		}

		return ans;
	}

	private static long power(int num, int i, int b) {
		// TODO Auto-generated method stub
		 long ans = 1;
		System.out.print(i+"power");

		for (int j = 1; j <= i; j++) {
			ans = (ans  * num ) % b;
		}
//		System.out.println(ans);
		return ans;
	}
}
