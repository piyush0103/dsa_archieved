package problem_solving;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
//		isPerfectNiteration(a, n);
		efficientIteration(a, n);
	}

	private static void efficientIteration(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < n; i++) {
			int sum = 1;
			if (a[i] == 1) {
				System.out.println("NO");
			} else {
				for (int j = 2; j*j < a[i]; j++) {
					if(a[i] % j == 0) {
					
					if(j*j==a[i]) {
						sum+=j;
					}
					else  {
						sum += j+(a[i]/j);
					}
					}
				}
				
				if (a[i] == sum) {

					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

	private static void isPerfectNiteration(int[] a, int n) {
		// TODO Auto-generated method stub

		System.out.println(a);
		for (int i = 0; i < n; i++) {
			int sum = 1;
			if (a[i] == 1) {
				System.out.println("NO");
			} else {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						sum += j;
					}
				}
				System.out.println("print:: " + sum);
				if (a[i] == sum) {

					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

}
