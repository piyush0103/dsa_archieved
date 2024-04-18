package problem_solving;

import java.util.Scanner;

public class Sum_Of_N {
public static void main(String[] args) {
	int sum=0;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	for(int i=1;i<n;i++) {
		sum+=i;
	}
	System.out.println(sum);
}
}
