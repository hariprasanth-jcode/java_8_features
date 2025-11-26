package streamsprogram;

import java.util.ArrayList;
import java.util.List;

public class Program10 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(null);
	al.add(-40);
	al.add(43);
	
	List<Integer> res = al.stream().filter(n->n!=null).toList();
	System.out.println(res);
	
	
	System.out.println(" ".isEmpty());
     System.out.println(" ".isBlank());
}
}
