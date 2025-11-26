package methodreference;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		
		al.forEach(i->System.out.println(i));
		
		System.out.println("Method reference");
		
		al.forEach(System.out::println);
	}
}
