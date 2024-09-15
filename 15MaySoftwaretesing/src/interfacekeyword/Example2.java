package interfacekeyword;
interface Sample1{
	int age=25;
	void calling();
}
interface Sample2{
	
	void display();
public class Example2 implements Sample1,Sample2 {
public void calling() {
	System.out.println("I am calling you ");
}
public void display() {
	System.out.println("I am displaying");
}
	public static void main(String[] args) {
    Example2 e1=new Example2();
    e1.calling();
    System.out.println("Sample interface age is :"+Sample.age);

	}

}
}