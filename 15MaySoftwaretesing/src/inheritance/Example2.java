package inheritance;

class Demo11 {
	static int age = 25;
	int salary = 45000;
}

class Demo12 extends Demo11 {
	void calling() {
		System.out.println("I am calling Method");
	}

	static void display() {
		System.out.println("I am display method");
	}
}

public class Example2 extends Demo12 {
	int age = 30;

	void show() {
		System.out.println("I am show Method");
	}

	public static void main(String[] args) {
    System.out.println("Demo11 ,Static variable age: "+Demo11.age);
    Demo12.display();
    Example2 ref=new Example2();
    System.out.println("Demo11, nonstatic variable using Exaple2 class object: "+ref.salary);
    ref.calling();
    System.out.println("Example2 nonstatic variable age: "+ref.age);
	}

}
