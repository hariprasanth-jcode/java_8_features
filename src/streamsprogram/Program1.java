package streamsprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class Program1 {

	
	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList();
		 
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 
		 //Stream initialization
		 al.stream().forEach(System.out::println);
		 
		 Stream.of(al);
		 
		 
		 HashSet<Integer> hs=new HashSet();
		 hs.stream();
		 
		 Stream.of(hs);
		 
		 int[] a= {4,1,7};
		 
		 Arrays.stream(a).forEach(System.out::println);;
		 
		 
		 String s="aabtdghj";
		 //stream 
		 //s.chars().forEach(i->System.out.println((char)i));;
	}
}
