package finalKeyword;

public class Example4 {

	public static void main(String[] args) {
		final int age=30;
		System.out.println("Age is "+age);
		 //age=50; // you get compile time error as final/constant variable value can't be re-initialize
		System.out.println("Age is "+age);
		//age=20; // you get compile time error as final/constant variable value can't be re-initialize
		System.out.println("Age is "+age);
	}

}
