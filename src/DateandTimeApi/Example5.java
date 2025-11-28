package DateandTimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {
	public static void main(String[] args) {
   
		LocalDateTime local=LocalDateTime.now();
		
		System.out.println(local);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
		System.out.println(local.format(format));
	}
}
