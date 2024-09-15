package constructor_this;

public class Example2 {
     int age=25;//Non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 ref=new Example2();
		ref.calling();
		ref.display(50);
		System.out.println("Program Ends ");

	}
	void calling() {
		System.out.println("I am calling method and age is :"+age);
	}
	void display(int age) {
		System.out.println("I am display method and age is :"+age);
		Example2 e1=new Example2();
		System.out.println("non static global variable age is :"+e1.age );
	}

}
