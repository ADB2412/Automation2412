package constructor;

public class Example2 {
	//User defined Construtor
	Example2(){
		System.out.println("I am zero param cons....");
		age=25;
		
	}
	
	public static void main(String[] args) {
		// to access non static member 1St Create an Instance of the class
		System.out.println("Program Starts");
		Example2 ref = new Example2();
		System.out.println("Age :" + ref.age);
		ref.testing();
		System.out.println("Program Ends");
	}

	void testing() {
		System.out.println("I am testing()...");
	}

	int age;

}
