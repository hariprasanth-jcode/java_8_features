package DateandTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example6 {
	public static void main(String[] args) {

		
		String start="25/11/2025";
		
		String end="01/01/2026";
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate s1=LocalDate.parse(start, format);
		
		LocalDate e1=LocalDate.parse(end, format);
		
		System.out.println(s1);
		System.out.println(e1);
		
		
	}
}
