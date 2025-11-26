package streamsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program11 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(null);
		al.add(-40);
		al.add(43);
		al.add(10);
		al.add(5);
		al.add(43);
		
		List<Integer> res1 = al.stream().distinct().collect(Collectors.toList());
          System.out.println(res1);
          Set<Integer> res2 = al.stream().distinct().collect(Collectors.toSet());
	    System.out.println(res2);
	}
}
