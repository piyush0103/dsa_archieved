package bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SingleElement3 {
	public static void main(String[] args) {
		int arr[] = {186, 256, 102, 377, 186, 377};
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
		ArrayList<Integer> anslist = new ArrayList<>();
		System.out.println(list);
		Map<Integer, Integer> arrayFreq = new LinkedHashMap<Integer, Integer>();
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if (arrayFreq.containsKey(list.get(i))) {
				arrayFreq.put(list.get(i), arrayFreq.get(list.get(i)) + 1);
			} else {
				arrayFreq.put(list.get(i), 1);
			}
		}

		System.out.println(arrayFreq);

		for (Map.Entry<Integer, Integer> entry : arrayFreq.entrySet()) {
			int count = 0;
			if (entry.getValue() == 1) {
				anslist.add(entry.getKey());
				System.out.println(entry.getKey()+"  "+count);
				count+=1;
			}

		}
		Collections.sort(anslist);
		return anslist;
	}
}
