package recursion;

public class Power2 {
	public static void main(String[] args) {
		int sys = power(5, 4);
		System.out.println(sys + "===?");

	}

	private static int power(int i, int j) {

		if (j == 0) {
			return 1;

		}

		int half = power(i, j / 2);
		int full = half * half;

		
		if(j%2==0) {
			return full;
		}else {
			return full*i;
		}
		
	}
}
