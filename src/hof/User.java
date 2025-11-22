package hof;

import java.util.ArrayList;
import java.util.List;

public class User {
	public static void main(String[] args) {
     
		ArrayList<Integer> al = new ArrayList();
		al.add(3);
		al.add(4);
		al.add(5);
		
		Demo.forEach(al, a->System.out.println(a));
		
		System.out.println("===========================");
		Demo.forEach(al, i->System.out.println(i*2));
		
	
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		
		Demo.forEach(al1, a->System.out.println(a));
		
		
		
	}
}
