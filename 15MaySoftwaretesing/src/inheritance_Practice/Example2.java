package inheritance_Practice;

class Demo11 {
	// default Constructor
	static int age = 25;
	int salary = 45000;
}

class Demo12 extends Demo11 {
	// default Constructor
	void calling() {
		System.out.println("I am calling method");
	}

	static void display() {
		System.out.println("I am display method");
	}
}

public class Example2 extends Demo12 {
	// default Constructor
	int age = 30;

	void show() {
		System.out.println("I am show Method");
	}

	public static void main(String[] args) {
		System.out.println("Demo11 static variable age :" + Demo11.age);
		Demo12.display();
		Example2 ref = new Example2();
		System.out.println("Demo11 non static using Example2 class object :" + ref.salary);
		ref.calling();
		System.out.println("Example2 non static varibale age :" + ref.age);
		ref.show();
	}

}
