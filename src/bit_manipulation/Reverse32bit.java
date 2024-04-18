package bit_manipulation;

public class Reverse32bit {
	public static void main(String[] args) {
long x=3;
long ans =reverse(x);
	}

	private static long reverse(long x) {
		// TODO Auto-generated method stub
		
		String binary=convertToBinary(x);
		
		long answer=convertToDecimal(binary);
		
//		System.out.println(answer+"  printing finlala");
		return answer;
	}

	private static long convertToDecimal(String binary) {
		// TODO Auto-generated method stub
		long answer=0;
		char arr[]=binary.toCharArray();
		int len=arr.length;
		int numericValue=0;
		for(int i=0;i<len;i++) {
//			System.out.print(arr[i]+" -- ");
	numericValue=Character.getNumericValue(arr[i]);
			answer+=numericValue*Math.pow(2, i);
		}
		
		return answer;
	}

	private static String convertToBinary(long x) {
		// TODO Auto-generated method stub
		String ans="";
		if(x==0) {
			ans="0";
			return ans;
		}
		long remainder=x;
		while(remainder!=0) {
			ans+=remainder%2;
			remainder=remainder/2;
		}
	

		ans=reverseString(ans);

       int diff=32-ans.length();
       
       for(int i=0;i<diff;i++) {
    	   ans="0"+ans;
       }
//		System.out.println("printing binary"+ans);
//		ans=reverseString(ans);
//		System.out.println("printing binary"+ans);
		
		return ans;
	}

	private static String reverseString(String ans) {
		// TODO Auto-generated method stub
		char charr[] =ans.toCharArray();
		int n=charr.length;
		int half=n/2;
	    char temp='\u0000';
		for(int i=0;i<half;i++) {
			temp=charr[i];
			charr[i]=charr[n-1-i];
			charr[n-1-i]=temp;
		}
		return new String(charr);
	}
}
