package modulus_arithmetic;

public class ExcelColumn {
public static void main(String[] args) {
	String s="AB";
	
int no=titleToNumber(s);
System.out.println(no);
}

private static int titleToNumber(String s) {
	// TODO Auto-generated method stub
	int slen=s.length();
	int mul=1;
	int ans=0;
	for(int i=slen-1;i>=0;i--) {
	ans+=mul*(s.charAt(i)-'A'+1);
	mul*=26;
	System.out.println(s.charAt(i)-'A');
	}
	
	return ans;
}
}
