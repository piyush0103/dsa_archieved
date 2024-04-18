package problem_solving;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {

//			isArmStrong(i);
			isArmStrongSimple(i);
		}

	}

	private static void isArmStrongSimple(int i) {
		// TODO Auto-generated method stub
		int temp=i,sum=0;

		while(temp!=0) {
		
			int r=temp%10;
			sum+=r*r*r;
			temp=temp/10;
		}
		if(sum==i) {
			System.out.println(i);
		}
	}

	private static void isArmStrong(int i2) {
		// TODO Auto-generated method stub

		int order = getOrder(i2);
//		System.out.println("printing order" + order);
		int temp = i2, sum = 0;

		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, order);
//			System.out.println("printing sum.."+sum+" "+r);
			temp = temp / 10;
		}
		if (sum == i2) {
			System.out.println(i2);
		}

	}

	private static int power(int r, int order) {
		// TODO Auto-generated method stub
		if (order == 1) {
			return 1;
		}
		if (order % 2 == 0) {
			return power(r, order / 2) * power(r, order / 2);
		}
		return r * power(r, order / 2) * power(r, order / 2);

	}

	private static int getOrder(int i2) {
		// TODO Auto-generated method stub
		int order = 0;
		while (i2 != 0) {
			order++;
			i2 = i2 / 10;

			
		}

		return order;
	}

}
