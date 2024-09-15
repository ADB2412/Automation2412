package methodfunction;

public class Metod1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		printDetails();// calling method directly
		System.out.println("*************************");
		Metod1.printDetails();
		System.out.println("Program ends");

	}

	public static void printDetails() {
		System.out.println("Welcome to Automation Session");
		System.out.println("you are learnin automation with java");
		System.out.println("currently you are in core java");
	}

}
