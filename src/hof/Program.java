package hof;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap();
		hm.put(13,10);
		hm.put(17,17);
		hm.put(19,19);
		hm.put(21,21);
		hm.put(7, 7);
		hm.put(17,33);
		System.out.println(hm);
	}
}
