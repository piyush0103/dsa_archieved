package bit_manipulation;

public class SamHelp {
	public static void main(String[] args) {

		System.out.println(solve(7));

	}

	public static int solve(int A) {
		 int count = 0;
		    for(int i = 0; i<30 ;i++)
		    {
		        if((A&(1<<i)) >0)
		        {
		            count++;
		        }
		    }
		    return count;
		
	}
}
