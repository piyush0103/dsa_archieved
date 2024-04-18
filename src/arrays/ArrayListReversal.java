package arrays;

import java.util.ArrayList;

public class ArrayListReversal {
public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5 };

	ArrayList<Integer> listArr = new ArrayList<>();
	ArrayList<Integer> listArrrev=null;
	for (Integer a : arr) {
		listArr.add(a);
	}

//	int left[] = { 2, 3 };
//
//	ArrayList<Integer> leftArr = new ArrayList<>();
//
//	for (Integer a : left) {
//		leftArr.add(a);
//	}

	listArrrev=reverseArray(listArr, 0, listArr.size());
	System.out.println(listArrrev);
}

private static ArrayList<Integer> reverseArray(ArrayList<Integer> listArr, int i, int size) {
	// TODO Auto-generated method stub
	int k = size - 1;
	

	while (i < k) {
		listArr.add(i, 3);
		listArr.add(k, 3);
		listArr.add(i, 3);
		i++;
		k--;
	}
	System.out.println(listArr.size()+"printing array size......");
return listArr;
}
}
