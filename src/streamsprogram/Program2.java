package streamsprogram;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
     
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		
		
		System.out.println(al);
		
		al.stream().map(i->i*i).forEach(System.out::println);;
	}
}
