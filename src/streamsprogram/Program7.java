package streamsprogram;

import java.util.ArrayList;

public class Program7 {
	public static void main(String[] args) {
     
		//find the count greater then given number
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(21);
		al.add(40);
		al.add(43);
		
		long res=al.stream().filter(i->i>20).count();
		System.out.println(res);
	}
}
