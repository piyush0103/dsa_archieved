package arrays.carryForword;

import java.util.ArrayList;

public class MinMaxSubArray {
public static void main(String[] args) {
int arr[] = {343, 291, 963, 165, 152};
ArrayList<Integer> arr1 =new ArrayList<Integer>();

for(int a:arr) {
	arr1.add(a);
}
int len=solve(arr1);
System.out.println(len+"answer");

}

private static int solve(ArrayList<Integer> arr1) {
	// TODO Auto-generated method stub
	
	Integer[] arr=arr1.toArray(new Integer[0]);
	int len=arr.length;
	int min=findMin(arr,len);
	int max=findMax(arr,len);
//	System.out.println(min+" "+max);
	int min_len=Integer.MAX_VALUE;
	int max_index=-1;
	int min_index=-1;
	for(int i=0;i<len;i++) {
		if(arr[i]==max) {
			max_index=i;
		}
		if(arr[i]==min) {
			min_index=i;
		}
		if(max_index>=0 && min_index>=0) {
	   if(min_len>Math.abs(max_index-min_index)+1) {
		   min_len=Math.abs(max_index-min_index)+1;
	   }
	System.out.println(min_len);
		}
	}
	
	
	return min_len;
}

private static int findMax(Integer[] arr, int len) {
	// TODO Auto-generated method stub
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<len;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;

}

private static int findMin(Integer[] arr, int len) {
	// TODO Auto-generated method stub
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<len;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
}
