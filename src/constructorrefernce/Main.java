package constructorrefernce;

public class Main {

	
	public static void main(String[] args) {
		
		/**
		 * Contructor refernce is used to provide 
		 * implmentation to the abstract method of 
		 * functional interface
		 * Rules
		 *  1)Argument of abstract method and constructor to be same
		 *  2)abstract method return type should be class type
		 * */
		Print obj=Employee::new;
		obj.print();
	}
}
