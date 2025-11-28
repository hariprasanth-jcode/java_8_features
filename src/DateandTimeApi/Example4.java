package DateandTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example4 {
	public static void main(String[] args) {
     
		LocalDate start=LocalDate.now();
		
		System.out.println(start);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MMMM/yyyy EEEE");
		System.out.println(start.format(format));
	}
}
