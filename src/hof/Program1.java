package hof;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
	public static void main(String[] args) {
        
		Function<String,Integer> obj=i->i.length();
		System.out.println(obj.apply("asdfghjkl"));
		
		Function<Integer,String> obj1=i->i+" hello";
		
				
		
		
		
	}
}
