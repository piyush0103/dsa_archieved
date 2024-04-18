package arrays.prefixsum;

import java.util.ArrayList;

public class RangeSumQuery {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Integer[][] arr_indices = { { 1, 4 }, { 2, 3 } };

		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i : arr) {
			arrList.add(i);
		}

		ArrayList<ArrayList<Integer>> arrindicesList = new ArrayList<>();
		ArrayList<Integer> listIndices = null;
		for (int i = 0; i < arr_indices.length; i++) {
			listIndices = new ArrayList<Integer>();
			for (int j = 0; j < arr_indices[0].length; j++) {
				listIndices.add(arr_indices[i][j]);
			}
			arrindicesList.add(listIndices);

		}

		System.out.println(new RangeSumQuery().rangeSum(arrList, arrindicesList));
	}

	public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<Long> result = new ArrayList<Long>();
		ArrayList<Long> ps = new ArrayList<Long>();

		for (int i = 0; i < A.size(); i++) {
			if (i == 0) {
				ps.add(i, Long.valueOf(A.get(0)));
			} else {
				ps.add(i, ps.get(i - 1) + Long.valueOf(A.get(i)));
			}
		}

//		Integer arrindex[][] = new Integer[B.size()][B.get(0).size()];
//		for (int i = 0; i < B.size(); i++) {
////			arrindex[i] = B.get(i).toArray(new Integer[0]);
//			
//		for(int j=0;j<B.get(i).size())	
//		}
		for (ArrayList<Integer> indices : B) {
			result.add(prefixSumArr(ps, indices));
		}

		return result;
	}

	private Long prefixSumArr(ArrayList<Long> arr, ArrayList<Integer> indices) {
		
		
		System.out.println(arr+"**");
		// TODO Auto-generated method stub
		int start = indices.get(0) - 1;
		int end = indices.get(1);
		Long ans = (long) 0;
		if(start==0) {
			ans=arr.get(end-1);
		}else {
			ans = arr.get(end-1) - arr.get(start-1);
		}
		return ans;
	}
}
