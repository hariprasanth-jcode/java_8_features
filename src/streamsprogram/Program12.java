package streamsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {
	public static void main(String[] args) {

		
		List<List<Integer>> l1=new ArrayList();
		
		List<Integer> l2=new ArrayList<Integer>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(100);
		l3.add(200);
		
		l1.add(l2);
		l1.add(l3);
		
		System.out.println(l1);
		
		List<Integer> res = l1.stream()
				.flatMap(i->i.stream())
				.collect(Collectors.toList());
	    System.out.println(res);
	
	}
}
