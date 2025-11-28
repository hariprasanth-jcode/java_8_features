package streamprogramonemployee;

import java.util.Map;
import java.util.stream.Collectors;

public class Program11 {
	public static void main(String[] args) {

		
		String s="aaabcedbde";
		
		Map<Character,Long> res=s.chars()
		.mapToObj(i->(char)i)
		.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		res.forEach((key,value)->System.out.println(key+" "+value));
	}
}
