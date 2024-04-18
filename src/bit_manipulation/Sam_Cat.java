package bit_manipulation;

public class Sam_Cat {
public static void main(String[] args) {
	int x=80;

	System.out.println(solve(x));
}

private static int solve(int x) {
		// TODO Auto-generated method stub
	int rounded = (int) (Math.log(x) / Math.log(2))+1;
		int count =0;
		
		for(int i=0;i<=rounded;i++) {
			if((x>>i & 1)==1) {
				count++;
			}
		}
		return count;
	}
	

}
