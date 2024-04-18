package bit_manipulation;

import java.util.ArrayList;

public class Compression {
public static void main(String[] args) {
	int arr[]= {1, 3, 5};
	
	ArrayList<Integer> list = new ArrayList<>();

	for (int a : arr) {
		list.add(a);
	}
	int bit = solve(list);
	System.out.println(bit);

	
	
}

private static int solve(ArrayList<Integer> list) {
	// TODO Auto-generated method stub
	
	Integer[] arr = list.toArray(new Integer[0]);
	
	int len=arr.length;
	int temp=0;
	
	for(int i=0;i<len-1;i++) {
		temp=arr[i];
	arr[i]=arr[i]&arr[i+1];
	arr[i+1]=temp|arr[i+1];
		
	}
	temp=0;
	System.out.println("result arr");
	for (int a : arr) {
		System.out.print(a+" ");
		temp^=a;
	}
	return temp;
}
}
