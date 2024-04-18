package arrays.prefixsum;

public class TestDel {
public static void main(String[] args) {
	int max_sum=0;
	System.out.println(test(3,max_sum));
}

private static int test(int k,int max_sum) {
	// TODO Auto-generated method stub
	double i=Math.random()*10+1;
	if(k==0) {
		return max_sum;
		
	}
	max_sum+=i;
	
	return Math.max(test(k-1, max_sum),test(k-1, max_sum));
}
}
