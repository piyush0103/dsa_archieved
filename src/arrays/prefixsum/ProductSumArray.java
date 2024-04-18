package arrays.prefixsum;

import java.util.ArrayList;

public class ProductSumArray {
public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5 };

	ArrayList<Integer> arrList = new ArrayList<>();
	for (int i : arr) {
		arrList.add(i);
	}

ArrayList<Integer> product=findProductSumArray(arrList,arrList.size());	
}

private static ArrayList<Integer> findProductSumArray(ArrayList<Integer> arrList, int size) {
	// TODO Auto-generated method stub
	Integer arr[]=arrList.toArray(new Integer[0]);
	ArrayList<Integer> result =new ArrayList<Integer>();
	int product=1;
	for(int a:arr) {
		product*=a;
	}
	for(int i=0;i<size;i++) {
		result.add(product/i);
	}
	
	
	return result;
}
}
