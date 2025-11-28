package optionalclass;

import java.time.LocalDate;
import java.util.Optional;

public class ExampleOfOptional {
	
	public static String getData(int id) {
		if(id==1) {
			return "hello";
		}
		return null;
	}
	
	public static Optional<String> getValue(int id){
		
		
		   if(id==1) {
			return Optional.ofNullable("hello");
		   }
		   return Optional.empty();
		
	}

	public static void main(String[] args) {
		
		String res=getData(1);
		System.out.println(res);
		System.out.println(res.toUpperCase());
		
		
		
		//System.out.println(getData(10).toUpperCase());
		
		Optional<String> res1=getValue(2);
		System.out.println(res1.orElse("Not found"));
		System.out.println(res1.isEmpty());
		System.out.println(res1.orElseThrow());
		System.out.println(res1.orElseThrow(()-> new ArithmeticException()));
		
		
		System.out.println(res1.isPresent());
	}
}
