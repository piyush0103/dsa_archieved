package arrays;

public class LeftRotate {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	
	rightRotate(arr,3);
}

private static void rightRotate(int[] arr, int i) {
	// TODO Auto-generated method stub
	 arrayReverse(arr,0,arr.length);
	 arrayReverse(arr,0,i-1);
	 arrayReverse(arr,i-1,arr.length);
	 
	 
	 for(int k:arr) {
		 System.out.print(k+" -- ");
	 }
	 
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
