package modulus_arithmetic;

public class GretestPossibleModulus {
	public static void main(String[] args) {
		int ans = greatestMOdulus(150, 170);
System.out.println(ans);
	}

	private static int greatestMOdulus(int i, int j) {
		// TODO Auto-generated method stub
		int max= Integer.MIN_VALUE;
		int ans = 0;
		int n = 0;
		if (i > j) {
			n = i;
		} else {
			n = j;
		}
//		for (int k = 1; k <= n; k++) {
//			if (i % k == j % k) {
//				ans = k;
//			}
//		
//		max=Math.max(max, ans);
//		}
//
//		return ans;
//	}

		
	return (i>j)?i-j:j-i;
	}		
		
	}
