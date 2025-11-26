package streamsprogram;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(21);
		al.add(40);
		al.add(43);
		
		al.stream().filter(i->i%2==0).forEach(System.out::println);
		
	}
}
