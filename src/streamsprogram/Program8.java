package streamsprogram;

import java.util.ArrayList;

public class Program8 {
	public static void main(String[] args) {
   
		ArrayList<Integer> al=new ArrayList();
		al.add(11);
		al.add(21);
		al.add(4);
		al.add(43);
		
		boolean res=al.stream().anyMatch(i->i%5==0);
		System.out.println(res);

	}
}
