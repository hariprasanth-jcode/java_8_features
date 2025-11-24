package methodreference;

public class Main {
	public static void main(String[] args) {

		/**
		 * Display method is providing method
		 * implementation to method of Demo interface
		 * 
		 * Method formal argument should be similar
		 * return type should be similar
		 * */
		Demo obj=Display::hello;
		obj.print();
	}
}
