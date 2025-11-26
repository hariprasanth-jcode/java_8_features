package streamsprogram;

import java.util.ArrayList;
import java.util.Optional;

public class Program6 {
	public static void main(String[] args) {
    
		ArrayList<String> al=new ArrayList();
		al.add("abc");
		al.add("efz");
		al.add("applz");
		
		al.stream().filter(s->s.charAt(s.length()-1)=='z')
		.forEach(System.out::println);
		
		
		Optional<String> res = al.stream()
				.filter(s->s.endsWith("z"))
				.findAny();
		
		System.out.println(res);
	}
}
