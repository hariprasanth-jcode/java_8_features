package hof;

import java.util.ArrayList;

public class User5 {
	public static void main(String[] args) {
      
		ArrayList<Integer> al=new ArrayList();
		al.add(20);
		al.add(31);
		al.add(40);
		
	
		
	  System.out.println(MyStream.of(al).filter(i->i%2==0).map(i->i*i));
	  
	  
	  ArrayList<String> al1=new ArrayList<String>();
	  
	  al1.add("allen");
	  al1.add("Miller");
	  
	  // System.out.println(MyStream.of(al1).map(i->i.toUpperCase()).map(i->i.charAt(0)).toList());
	
	 //  System.out.println(MyStream.of(al1).filter(i->i.length()%2==0).map(i->i.toUpperCase()).toList());
	
	   MyStream.of(al1).map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	   
	   
	   
	   ArrayList<Student> al2=new ArrayList<Student>();
	   al2.add(new Student(1,"Miller",60));
	   al2.add(new Student(2,"King",40));
	   
	   MyStream.of(al2)
	   .filter(i->i.getPer()<=50)
	   .map(i->{
		   i.setPer(70);
		   return i;
	   }).forEach(i->System.out.println(i));
	
	}
}
