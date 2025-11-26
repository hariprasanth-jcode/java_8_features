package streamsprogram;

import java.util.ArrayList;

public class Program4 {
	public static void main(String[] args) {
     
		ArrayList<String> al=new ArrayList();
		al.add("abc");
		al.add("efg");
		
		al.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	}
}
