package arrays.carryForword;

public class AmazingSqnce {
	public static void main(String[] args) {
		
	
	String str="ABEC";
	int count=solve(str);	
	System.out.println(count);
	
	}
	private static int solve(String str) {
		// TODO Auto-generated method stub
		
		char[] charArr=str.toCharArray();
		int countseq=0;
		int len=charArr.length;
		for(int i=0;i<len;i++) {
			if(charArr[i]=='A' ||charArr[i]=='E' ||charArr[i]=='I' ||charArr[i]=='O'||charArr[i]=='U'||charArr[i]=='a'||charArr[i]=='e'||charArr[i]=='i'||charArr[i]=='o'||charArr[i]=='u') {
				countseq+=(len-i);
			}
		}
		
		return countseq%10003;
	}
	

}
