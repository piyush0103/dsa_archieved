package bit_manipulation;

public class BitwiseXorSubArray {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 1 };

		long bit = solve(arr);
		System.out.println(bit);

	}

	private static long solve(int[] arr2) {
		// TODO Auto-generated method stub
		long count = 0;
		long next=0;
		for (int i = 0; i < arr2.length; i++) {
		if(arr2[i]==1) {
			next=i+1;
		}
		count=count+next;

		}
		return count;
	}
}
