package streamsprogram;

import java.util.ArrayList;
import java.util.Optional;

public class Program5 {
	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("abc");
		al.add("efg");
		al.add("apple");
		
		al.stream()
		.filter(s->s.startsWith("a"))
		.limit(1).forEach(System.out::println);
		
		Optional<String> res = al.stream()
				.filter(s->s.startsWith("a"))
				.findFirst();
		 System.out.println(res);
	}
}
