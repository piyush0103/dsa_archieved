package modulus_arithmetic;

public class LongModEasySol {
	public static void main(String[] args) {
		System.out.println(findLongMod("43535321", 47));
	}

	private static int findLongMod(String string, int B) {
		// TODO Auto-generated method stub
		long num = 0, rem = 0;
		for (int i = 0; i < string.length(); i++) {
			num = rem * 10 + string.charAt(i) - '0';
			rem = num % B;
		}

		return (int) rem;
	}
}
