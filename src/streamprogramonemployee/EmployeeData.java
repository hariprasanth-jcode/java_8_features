package streamprogramonemployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {

	public static List<Employee> generateSampleEmployees() {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(5, "Ethan", "Delhi", 40, "Male", "Admin", 2010, 75000));
        employees.add(new Employee(6, "Fiona", "Mumbai", 32, "Female", "HR", 2013, 57000));
        employees.add(new Employee(7, "George", "Chennai", 29, "Male", "Sales", 2019, 50000));
        employees.add(new Employee(1, "Alice", "Chennai", 28, "Female", "IT", 2018, 60000));
        employees.add(new Employee(2, "Bob", "Bangalore", 35, "Male", "HR", 2015, 55000));
        employees.add(new Employee(8, "Hannah", "Bangalore", 31, "Female", "IT", 2017, 68000));
        employees.add(new Employee(9, "Ian", "Pune", 34, "Male", "Finance", 2012, 72000));
        employees.add(new Employee(10, "Julia", "Hyderabad", 27, "Female", "IT", 2021, 61000));
        employees.add(new Employee(3, "Charlie", "Hyderabad", 30, "Male", "Finance", 2016, 58000));
        employees.add(new Employee(4, "Diana", "Pune", 26, "Female", "IT", 2020, 62000));
       
                
        return employees;
    }
	
	public static void main(String[] args) {
		List<Employee> list = generateSampleEmployees();
		//list.stream().forEach(System.out::println);
		
//		list.stream()
//		.filter(emp->emp.getSalary()>60000)
//		.forEach(System.out::println);
		
//		list.stream()
//		.filter(emp->emp.getGender().equalsIgnoreCase("Male"))
//		.forEach(System.out::println);
//		
//		
//		long countofmale=list.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male"))
//		.collect(Collectors.counting());
//		
//		System.out.println(countofmale);
		
//		list.stream()
//		.sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
//		.forEach(System.out::println);
//		
		
//		Optional<Employee> max = list
//				.stream()
//				.max((e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
//	    System.out.println(max);
		
//		Map<Integer, String> map = list.stream()
//				.collect(Collectors
//						.toMap(emp->emp.getId(), emp->emp.getName()));
//	     System.out.println(map);
		
//		Map<String,List<Employee>> groupbydept=list.stream()
//				.collect(Collectors.groupingBy(emp->emp.getDepartment()));
	    //System.out.println(groupbydept);
	    
	   // groupbydept.forEach((key,value)->System.out.println(key+" "+value));
	    
//	   Map<Boolean,List<Employee>> resPartition= list.stream()
//			   .collect(Collectors
//               .partitioningBy(emp->emp.getSalary()>60000));
//	  // System.out.println(resPartition);
//	   
//	   resPartition.forEach((key,value)->{
//		   if(key==false) {
//		   System.out.println(key+" "+value);
//		   }
//	   }
//	   );
		
		DoubleSummaryStatistics res = list.stream()
				.collect(Collectors
						.summarizingDouble(e->e.getSalary()));
	   
		System.out.println(res);
		System.out.println(res.getMax());
		System.out.println(res.getMin());
		System.out.println(res.getAverage());
	}
}
