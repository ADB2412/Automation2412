package abstractprog;
abstract class Demo3{//50% abstract 
	abstract void print (); //abstract method/incomplete method
	void display(){//normal or non abstract method or concrete or complete method
	  System.out.println("I am non abstract method display()..");
	
	
}
}
abstract class Demo { //0%abstract
	void display1() {
		System.out.println("I am non abstract method display()...");
	}
	void display2() {
		System.out.println("I am non abstract method display()...");
	}
}
abstract class Demo2 {//100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
