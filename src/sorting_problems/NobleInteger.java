package sorting_problems;

import java.util.Arrays;

public class NobleInteger {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 3};
		int ans = findNobleIntegr(arr);
		System.out.println(ans);
	}

	private static int findNobleIntegr(int[] arr) {
		// TODO Auto-generated method stub

		if(arr[arr.length-1]==0) {
			return 1;
		}
		Arrays.sort(arr);
		
		
		int len=arr.length;
		int count=len;
		for(int i=len-2;i>=0;i--) {
			if(arr[i+1]!=arr[i]) {
				count=len-1-i;
			}
			if(arr[i]==count) {
				return 1;
			}
		}
		
		
return -1;		
}}

