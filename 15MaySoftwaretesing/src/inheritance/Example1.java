package inheritance;
class Demo1{
	static int age =25;
	int salary=45000;
}
class Demo2{
	void calling() {
		System.out.println("I am calling Method");
	}
	static void display() {
		System.out.println("I am display method");
	}
}
public class Example1 {
	int age=30;
	void show() {
		System.out.println("I am show Method");
	}

	public static void main(String[] args) {
	System.out.println("Demo1 static Variable age is : "+Demo1.age);
    Demo2.display();
    Demo1 d1=new Demo1();
    System.out.println("Demo1 ,nonstatic variable salary: "+d1.salary);
    Demo2 d2=new Demo2();
    d2.calling();
    Example1 e1=new Example1();
    System.out.println("Example1 nonstatic variable age : "+e1.age); 
    e1.show();
    
	}

}
