package arrays;

public class Max_Freq {
public static void main(String[] args) {
int arr[]= {7,8,5,-6,2,0,-3,1,8,8,9,9,11,5,11,6,11};

int max=Integer.MIN_VALUE;
int freq=1;

for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
		freq=0;
		
	}
	if(max==arr[i]) {
		freq++;
	}
}

System.out.println("maximum frequency "+max);
System.out.printf("maximun freq and max %d %d",max,freq);

}

}
