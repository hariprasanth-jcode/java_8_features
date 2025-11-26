package streamsprogram;

import java.util.ArrayList;

public class Program9 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(21);
		al.add(-40);
		al.add(43);
	
		
	  boolean res=al.stream().allMatch(n->n>0);
	  System.out.println(res);
	}
}
