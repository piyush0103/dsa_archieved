package time_complexity;

public class Iteration {

	
	public void solve(int n){
	    for(int i = 0; i < n; i++){
	        for(int j=0; j < i / 2; j++){
	            // O(1) operation
	        	System.out.println("print ");
	        }
	    }
	}
	public static void main(String[] args) {
		
	
new Iteration().solve(20);
	}
}
