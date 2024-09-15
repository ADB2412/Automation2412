package constructor;

public class Example1 {
	// In this class we have default constructoras it doesn't have any construtor
	// written by Programmer
	public static void main(String[] args) {
		// to access non static member 1St Create an Instance of the class
		Example1 ref = new Example1();
		System.out.println("Age :" + ref.age);
		ref.testing();
	}

	void testing() {
		System.out.println("I am testing()...");
	}

	int age;

}
