package arrays.carryForword;

import java.util.ArrayList;

public class LeaderElement {
public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
	
		for (int a : arr) {
			arr1.add(a);
		}
		ArrayList<Integer> leaderElem= solve(arr1);
	}

private static ArrayList<Integer> solve(ArrayList<Integer> arr1) {
	// TODO Auto-generated method stub
	
	ArrayList<Integer> leaderElem =new ArrayList<Integer>();
	Integer[] arr = arr1.toArray(new Integer[0]);
	int max=arr[0];
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		if(arr[i]>max) {
			leaderElem.add(arr[i]);
			max=arr[i];
		}
		
	}
	
	return leaderElem;
}
}
