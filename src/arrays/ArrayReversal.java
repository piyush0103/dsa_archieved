package arrays;

import java.util.ArrayList;

public class ArrayReversal {
public static void main(String[] args) {
	int arr[]= {1,2,3,2,1};
	ArrayList<Integer>arrList =new ArrayList<>();
	for(Integer a:arr) {
		arrList.add(a);
	}
	
	
	System.out.print("[");
for(int i=0;i<arr.length-1;i++) {
	System.out.print(arr[i]+",");
}
System.out.print(arr[arr.length-1]+"]");

	
	System.out.println();
	
	
	reverseArray(arrList);
}

private static void reverseArray(ArrayList<Integer> arrList) {
	// TODO Auto-generated method stub
	
		Integer arr[]=arrList.toArray(new Integer[0]);
		
		int start=0 , end=arr.length-1;
		
		while(start<end) {
			arr[start]+=arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
		start++; end--;
		}
	
		System.out.print("[");
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.print(arr[arr.length-1]+"]");
	}
	}
