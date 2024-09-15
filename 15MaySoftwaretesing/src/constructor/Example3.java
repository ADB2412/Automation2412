package constructor;

public class Example3 {
	// User defined Construtor
	Example3(int num) {
		System.out.println("I am int param cons....");
		age = num;

	}

	public static void main(String[] args) {
		// to access non static member 1St Create an Instance of the class
		System.out.println("Program Starts");
		Example3 ref = new Example3(25);
        System.out.println("Age :" + ref.age);
		ref.testing();
		Example3 ref1 = new Example3(50);
		System.out.println("Age :" + ref1.age);
		ref1.testing();
		System.out.println("Program Ends");
	}

	void testing() {
		System.out.println("I am testing()...");
	}

	int age;

}
