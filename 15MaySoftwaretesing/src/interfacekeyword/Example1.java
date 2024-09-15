package interfacekeyword;
interface Sample{
	int age=25;
	void calling();
}
public class Example1 implements Sample {
public void calling() {
	System.out.println("I am calling you ");
}
	public static void main(String[] args) {
    Example1 e1=new Example1();
    e1.calling();
    System.out.println("Sample interface age is :"+Sample.age);
	}

}
