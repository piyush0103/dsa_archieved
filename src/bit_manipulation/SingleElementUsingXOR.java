package bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class SingleElementUsingXOR {

	public static void main(String[] args) {

		int arr[] = { 186, 256, 102, 377, 186, 377 };
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<Integer> anslist = new ArrayList<>();
	
			for (int a : arr) {
				list.add(a);
			}
			anslist = solve(list);
			System.out.println(anslist);

	}

	private static ArrayList<Integer> solve(ArrayList<Integer> list) {
		// TODO Auto-generated method stub

		Integer[] arr = list.toArray(new Integer[0]);
		int xor = 0;
		for (int a : arr) {
			xor ^= a;
		}
		ArrayList<Integer> indexList = checkIndex(xor);

		System.out.println(xor);
		System.out.println(checkIndex(337));
		System.out.println(checkIndex(705));
		int xor1 = 0, xor2 = 0;
		for (int a : arr) {
			if (checkIndex(a).contains(indexList.get(0))) {
				System.out.println();
				System.out.print("   xxx  ");
				System.out.println(checkIndex(a));

				xor1 ^= a;
			} else {
				System.out.println();
				System.out.print("   yyy  ");
				System.out.println(checkIndex(a));

				xor2 ^= a;
			}
		}

		ArrayList<Integer> anslist = new ArrayList<>();
		anslist.add(xor1);
		anslist.add(xor2);
		Collections.sort(anslist);
		return anslist;
	}

	private static ArrayList<Integer> checkIndex(int xor) {
		// TODO Auto-generated method stub
		ArrayList<Integer> anslist = new ArrayList<>();

		for (int i = 0; i < 31; i++) {
			if ((xor & (1 << i)) == (1 << i)) {
				anslist.add(i);
			}
		}
		return anslist;
	}

}
