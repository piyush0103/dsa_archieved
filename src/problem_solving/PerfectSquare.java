package problem_solving;

import java.util.Scanner;

public class PerfectSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	int sqrt=(int) Math.sqrt(n);
	
	
	if(sqrt*sqrt==n) {
		System.out.println(n);
	}else {
		System.out.println(-1);
	}

}
}
