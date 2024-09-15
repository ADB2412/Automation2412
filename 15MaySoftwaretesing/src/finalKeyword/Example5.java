package finalKeyword;

public class Example5 {

	public static void main(String[] args) {
		final int age;
		System.out.println("Program starts");
		 age=50; 
		System.out.println("Age is "+age);
		//age=20; // you get compile time error as final/constant variable value can't be re-initialize
		System.out.println("Program ends");
	}

}
