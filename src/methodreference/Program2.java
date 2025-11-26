package methodreference;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		
	     Map<String,Integer> hm=new HashMap();
	     hm.put("A", 1);
	     hm.put("B", 2);
	     
	   //  Can only iterate over an array or 
	     //an instance of java.lang.Iterable
//	     for(Map.Entry<String, Integer> obj:hm.entrySet()) {
//	    	 
//	    	 System.out.println(obj.getKey()+" "+obj.getValue());
//	     }
	     
	     hm.forEach((key,value)->System.out.println(key+" "+value));
	}
}
