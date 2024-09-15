package inheritance;

class Fruit {
	Fruit(int num) {
		System.out.println("I am fruit class cons...");
	}

	void taste() {
		System.out.println("Fruits are sweet");
	}
}

class Apple extends Fruit {
	Apple(int num) {
		super(25);
		System.out.println("I am Apple Class Cons...");

	}

	void shape() {
		System.out.println("Apples are round in shape");
	}
}

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Apple ref = new Apple(20);
		ref.shape();
		System.out.println("Program Ends");
	}

}
