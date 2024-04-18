package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_pair {

	public int solve(ArrayList<Integer> A, int B) {
		Integer[] arr = A.toArray(new Integer[0]);
		
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==B) {
					return 1;
				}
			}
		}
		

		return 0;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		ArrayList<Integer> listarr = new ArrayList<>();
		for (Integer a : arr) {
			listarr.add(a);
		}
		System.out.println(new Array_pair().solve(listarr, 7));

	}
}
