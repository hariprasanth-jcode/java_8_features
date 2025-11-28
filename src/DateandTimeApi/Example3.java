package DateandTimeApi;

import java.time.Duration;
import java.time.LocalTime;

public class Example3 {
	public static void main(String[] args) {

		LocalTime start=LocalTime.of(15,30);
		
		LocalTime end=LocalTime.of(21, 30);
		
		Duration duration=Duration.between(start,end);
		System.out.println(duration.toHours());
		System.out.println(duration.toMinutes());
		
		
		
	}
}
