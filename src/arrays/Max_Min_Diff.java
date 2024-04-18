package arrays;

import java.util.ArrayList;

public class Max_Min_Diff {
public static void main(String[] args) {
	int arr[]= {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
	
	ArrayList<Integer> list =new ArrayList<>();
	
	for(Integer a:arr) {
		list.add(a);
	}

	findMaxMinDiff(list,arr.length);

}

private static void findMaxMinDiff(ArrayList<Integer> list, int length) {
	// TODO Auto-generated method stub
	
	Integer[] arr=list.toArray(new Integer[0]);
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<length;i++) {
	

		if(arr[i]%2==0 && arr[i]>max) {
			System.out.println(arr[i]+" max "+i);
			
			max=arr[i];
		}
		 if(arr[i]%2!=0 && arr[i]<min) {
			System.out.println(arr[i]+" mi "+i);
		
			min=arr[i];
		}
	}
	System.err.println(max+" **");
	System.out.println(min+"--");
	System.out.println(max-min);
}



}
