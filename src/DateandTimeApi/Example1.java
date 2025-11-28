package DateandTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example1 {
	public static void main(String[] args) {
		
	LocalDate	localDate=LocalDate.now();

	System.out.println(localDate);
	//to set CustomDate
	LocalDate localDate1=LocalDate.of(2025,11,30);
	
	System.out.println("Date : "+localDate1);
	
	
	LocalTime localTime=LocalTime.now();
	System.out.println(localTime);
	
	//to set custom time 
	 localTime=LocalTime.of(1, 30);
	   
	System.out.println(localTime);
	
	LocalDateTime localDateTime=LocalDateTime.now();
	System.out.println(localDateTime);
	
	//To get the zonal time 
	ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
	System.out.println(tokyo);
	
	}
}
