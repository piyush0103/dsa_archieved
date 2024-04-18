package Arrays_Math;

public class MagicNoPattern {
	public static void main(String[] args) {

		int arr[] = solve(10);
		for (int a : arr) {
			System.out.print(a + " <==> ");
		}
	}

	private static int[] solve(int n) {
		// TODO Auto-generated method stub

		int arr[] = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = findMagicNos(i);
		}
		return arr;
	}

	private static int findMagicNos(int i) {
		// TODO Auto-generated method stub
		int binary[] = findBinary(i);
		int decimal = findDecimal(binary);

		return decimal;
	}

	private static int findDecimal(int[] binary) {
		// TODO Auto-generated method stub
		int ans = 0;
		int count = 1;
		for (int i = 0; i < binary.length; i++) {
			ans += binary[i] * Math.pow(5, count);
			count++;
		}

		return ans;
	}

	private static int[] findBinary(int i) {
		// TODO Auto-generated method stub
		int temp = i;
		String ans = "";
		while (temp > 0) {
			ans += temp % 2;
			temp /= 2;
		}
//		ans += 
//		System.out.println(ans);
		int len = ans.length();
		int binary[] = new int[len];
		for (int j = 0; j < len; j++) {
			binary[j] = Character.getNumericValue(ans.charAt(j));
		}
		return binary;
	}
}
