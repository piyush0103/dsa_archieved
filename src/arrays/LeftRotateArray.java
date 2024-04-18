package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateArray {
	public static void main(String[] args) {

		int arr[] = {  6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };

		ArrayList<Integer> listArr = new ArrayList<>();

		for (Integer a : arr) {
			listArr.add(a);
		}

		int left[] = {36};

		ArrayList<Integer> leftArr = new ArrayList<>();

		for (Integer a : left) {
			leftArr.add(a);
		}
		ArrayList<ArrayList<Integer>> list = solveRotate(listArr, leftArr);

		for (List<Integer> arrList : list) {
				System.out.println(arrList);
			}
			System.out.println();
		

	}

	private static ArrayList<ArrayList<Integer>> solveRotate(ArrayList<Integer> listArr, ArrayList<Integer> leftArr) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> listLeftRotated = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> leftList = null;
		int size = listArr.size();
		for (int a : leftArr) {
			if(a>size) {
				System.out.println("coming in  right "+leftArr.size()+1);

				leftList = leftRotate(listArr, a % size);

			}else {
				System.out.println("coming in  left");
				leftList = leftRotate(listArr, size % a);

			}
			listLeftRotated.add(leftList);
		}

		return listLeftRotated;
	}

	private static ArrayList<Integer> leftRotate(ArrayList<Integer> listArr, int a) {
	

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Integer arr[] = listArr.toArray(new Integer[0]);
		arr = leftRotate(arr, a);

		for (int j : arr) {
			arrayList.add(j);
		}
		return arrayList;
	}

	private static Integer[] leftRotate(Integer[] arr, int a) {
		// TODO Auto-generated method stub
		int len=arr.length;
		System.out.println(len+" -- "+a);

		if(a==0) {
			return arr;
		}
		int temp[] = new int[a];

		for (int i = 0; i< a; i++) {
			temp[i] = arr[i];
		}

//		moving array forword

		for (int i = 0; i <arr.length - a; i++) {
			arr[i] = arr[i + a];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[len- a+i] = temp[i];
		}
		return arr;
	}
}
//	private static ArrayList<Integer> leftRotate(ArrayList<Integer> listArr, int a) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		Integer arr[] = listArr.toArray(new Integer[0]);
//
////		System.out.println(listArr);
////		System.out.println("vjfdsnbvjfsdbj");
//		arr = reverseArray(arr, 0, arr.length);
//		
//		arr=reverseArray(arr, 0,a);
//	
//		arr=reverseArray(arr, a, listArr.size());
//		
////		arr = reverseArray(arr, 0, arr.length);
//
//		for(int j:arr) {
//			System.out.print(j+" - ");
//		}
//		System.out.println();
////		for(int j:arr) {
////			System.out.print(j+" - ");
////			arrayList.add(j);
////		}
////		System.out.println();
//		return arrayList;
//	}
//
//	private static Integer[] reverseArray(Integer listArr[], int i, int size) {
//		// TODO Auto-generated method stub
//		int k = size - 1;
//
//		while (i < k) {
//			listArr[i] = listArr[i] + listArr[k];
//			listArr[k] = listArr[i] - listArr[k];
//			listArr[i] = listArr[i] - listArr[k];
//			i++;
//			k--;
//		}
//		return listArr;
//	}
//}
