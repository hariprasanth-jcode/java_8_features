package hof;

import java.util.ArrayList;
import java.util.List;

public class MyStream<E> {
	
	
	
	private  ArrayList<E> al;
	
	MyStream(){
		
	}
	
	
	
	private MyStream(ArrayList<E> al) {
	
		this.al=al;
	}
 
	
	public static <T> MyStream<T> of(ArrayList<T> list) {
		
		return new MyStream<T>(list);
	}


	public  <T,R> MyStream<E> map(Function<E, R> func) {
		
		ArrayList<R> result = new ArrayList();
		
		for(E  i:al) {
			result.add(func.apply(i));
		}
		return  new MyStream(result);
	}
	
	public <T> MyStream<E> filter(Predicate<E> predicate) {
		ArrayList<E> result=new ArrayList();
		for(E i:al) {
			if(predicate.test(i)) {
				result.add(i);
			}
		}
		return new MyStream(result);
	} 
	
	public List<E> toList(){
		return al;
	}
	
	public void forEach(Consumer<E> consumer) {
		
		for(E i:al) {
		consumer.accept(i);
		}
	}
	

}
