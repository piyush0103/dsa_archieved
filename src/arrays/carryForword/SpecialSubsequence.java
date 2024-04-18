package arrays.carryForword;

public class SpecialSubsequence {
public static void main(String[] args) {
String str="ABCGAG";
int count=solve(str);	
}

private static int solve(String str) {
	// TODO Auto-generated method stub
	
	char[] charArr=str.toCharArray();
	int countseq=0;
	int acount=0;
	int len=charArr.length;
	for(int i=0;i<len;i++) {
		if(charArr[i]=='A') {
			acount++;
		}
		if(charArr[i]=='G') {
			countseq+=acount;
		}
	}
	
	return countseq;
}
}
