package arrays;

import java.util.Scanner;

public class ArrrayRotation {
private int arraylen;
private int arrayRotate;

private int[] rotateArrayRight(int len,int rotateRight) {
int arr[] =new int[len];
int count=0;

for(int i=len;i>0;i--) {
arr[count++]=i;	
}
System.out.println("array Before Rotation...."+len);
for(int a:arr) {
	System.out.print(a+" ||  ");
}

System.out.println("rotating array in progress......");

int last=0;
for(int i=0;i<rotateRight;i++) {
last=arr[len-1];	
for(int j=len-1;j>0;j--) {
arr[j]=arr[j-1];	
	
}

arr[0]=last;
}



return arr;
}

public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
	int len,rotate;
	System.out.println("enter arrray length");
	len=sc.nextInt();
	System.out.println("enter no of times array shpul rotate...");
	rotate=sc.nextInt();

ArrrayRotation arrRotate=new ArrrayRotation();


int[] arr=arrRotate.rotateArrayRight(len, rotate);
System.out.println("arrray after rotaion");
for(int a:arr) {
	System.out.print(a+" ||  ");
}

}

}
