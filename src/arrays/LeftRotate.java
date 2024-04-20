package arrays;

public class LeftRotate {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int arr2[]= {1,2,3,4,5,6,7,8,9};
	rightRotate(arr,3);
	leftRotate(arr2,4);
}

private static void rightRotate(int[] arr, int d) {
	// TODO Auto-generated method stub
	 arrayReverse(arr,0,arr.length);
	 arrayReverse(arr,0,d-1);
	 arrayReverse(arr,d-1,arr.length);
	 
	 
	 for(int k:arr) {
		 System.out.print(k+" -- ");
	 }
	System.out.println();
}

	private static void leftRotate(int[] arr, int d) {
	int n=arr.length;
		// TODO Auto-generated method stub
		arrayReverse(arr,0,n);
		arrayReverse(arr,n-d,n);
		arrayReverse(arr,0,d);


		for(int k:arr) {
			System.out.print(k+" -- ");
		}
		System.out.println();
	}
 private static int[] arrayReverse(int arr[],int i,int len) {
	 int k=len-1;
	 
	 while(i<k) {
		 
		 arr[i]=arr[i]+arr[k];
		 arr[k]=arr[i]-arr[k];
		 arr[i]=arr[i]-arr[k];
		 
		 i++;
		 k--;
	 }
	return arr; 
 }

}
