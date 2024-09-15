package constructor_this;

public class Example3 {
     int age=25;//Non-static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref=new Example3();
		ref.calling();
		ref.display(50);
		System.out.println("Program Ends ");

	}
	void calling() {
		System.out.println("I am calling method and age is :"+age);
	}
	void display(int age) {
		System.out.println("I am display method and age is :"+age);
		//Example3 e1=new Example3();
		//System.out.println("non static global variable age is :"+e1.age );
		           //OR ---use "this" ketword
		System.out.println("non static global variable age is :"+this.age );
	}

}
