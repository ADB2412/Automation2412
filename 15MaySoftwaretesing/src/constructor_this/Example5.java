package constructor_this;

public class Example5 {
     int age=25;//Non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example5 ref=new Example5();
		System.out.println("Example4 object ref value is: "+ref);
		ref.display(50);
		System.out.println("Program Ends ");

	}
	void calling() {
		System.out.println("I am calling method and age is :"+age);
	}
	void display(int age) {
		System.out.println("I am display method and age is :"+age);
		System.out.println("non static global variable age is :"+this.age );
		System.out.println("this keyword value is :"+this);
		//calling();
		//OR
		this.calling();
	}

}
