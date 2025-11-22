package hof;

import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Custom Stream api 
 * to perform functional and declarative program on collection of  data
 * these stream is defined to work on  arraylist 
 * 
 * @author Hariprasanth H A
 * */
public class MyStream<E> {
	
	
	
	private  ArrayList<E> al;
	
	MyStream(){
		
	}
	
	private MyStream(ArrayList<E> al) {
	
		this.al=al;
	}
 
	
	/**
	 * To declare the Stream of ArrayList
	 * and use function and declarative program on the list
	 * 
	 * @return MyStream<T>
	 *
	 * */
	
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
	
	/**
	 * it is a terminal function
	 * use to convert stream result to list
	 * 
	 * @return List<E>
	 * */
	public List<E> toList(){
		return al;
	}
	
	/**
	 * it is a terminal function 
	 * use for iteration 
	 * 
	 * @return void
	 * */
	public void forEach(Consumer<E> consumer) {
		
		for(E i:al) {
		consumer.accept(i);
		}
	}
	
		

}
