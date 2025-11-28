package DateandTimeApi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Example2 {
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2025, 12, 15);
		
		LocalDate start = LocalDate.of(2025, 1, 1);
		
		LocalDate expiryDate=LocalDate.of(2026, 1, 1);
		
		LocalDate today=LocalDate.now();
		
		if(expiryDate.isBefore(today)) {
			System.out.println("MemberShip   InValid");
		}else {
			System.out.println("MemberShip is Valid");
		}
		
		Period p=Period.between(today,expiryDate);
		System.out.println(p.getDays()+" Days ");
		System.out.println(p.getMonths()+" Month ");
		System.out.println(p.getYears()+" Years ");
		
		long daysleft=ChronoUnit.DAYS.between(today,expiryDate);
		System.out.println("Days Left "+daysleft);
				
	}
}
