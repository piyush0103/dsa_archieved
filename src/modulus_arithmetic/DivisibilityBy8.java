package modulus_arithmetic;

public class DivisibilityBy8 {
	public static void main(String[] args) {
		System.out.println(divisibilityBy8("123"));
	}

	private static byte divisibilityBy8(String no) {
		// TODO Auto-generated method stub
		byte flag = 0;
		int num = 0;
		if (no.length() < 3) {
			num = Integer.parseInt(no);
		} else {
			num = Integer.parseInt(no.substring(no.length() - 3, no.length()));
		}
		if (num % 8 == 0) {
			flag = 1;
		} else {
			flag = 0;
		}

		return flag;
	}
}
