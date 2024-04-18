package bit_manipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;

public class Test {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 3, 3, 3);

		int sum = l.stream().filter(a -> a % 2 != 0).map(a -> a * a).reduce(0, (e1, e2) -> e1 + e2);
		System.out.println(sum);

		int freq = frequency(l);
		System.out.println(freq + " f");

	}

	private static int frequency(List<Integer> l) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> map = new HashMap<>();
		int no = l.get(0);
		int freq = 0;
		for (Integer a : l) {
			int value=1;
			if (map.containsKey(a)) {
			value+=map.get(a);
			}
			
			map.put(a, value);
			if(freq<value) {
				freq=value;
				no=a;
			}
		}

		

//		for (Entry<Integer, Integer> entry : map.entrySet()) {
//			if (freq < entry.getValue()) {
//				freq = entry.getValue();
//				no = entry.getKey();
//			}
//		}

		return no;
	}
}
