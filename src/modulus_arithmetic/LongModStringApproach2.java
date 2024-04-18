package modulus_arithmetic;

public class LongModStringApproach2 {

	public static void main(String[] args) {
		System.out.println(findMod("43535321", 47));
	}

	private static int findMod(String A, int B) {
		// TODO Auto-generated method stub
		long num = 0, rem = 0;
		for (int i = 0; i < A.length(); i++) {
			
			num = rem * 10 + (A.charAt(i) - '0');
			System.out.println(num);
			rem = num % B;
		}
		int remainder = (int) rem;
		return remainder;

	}

}
