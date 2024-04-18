package bit_manipulation;

import java.util.ArrayList;

public class EvenOddOcc {
public static void main(String[] args) {
	int arr[] = {};
	ArrayList<Integer> arr1 = new ArrayList<Integer>();

	for (int a : arr) {
		arr1.add(a);
	}
	int leaderElem= solve(arr1);

}

private static int solve(ArrayList<Integer> arr1) {
	// TODO Auto-generated method stub
	
	ArrayList<Integer> leaderElem =new ArrayList<Integer>();
	Integer[] arr = arr1.toArray(new Integer[0]);
	int n=arr.length;
	int ans=0;
	for(int i=0;i<n;i++) {
		ans^=arr[i];
	}
	
	return ans;
}


}
