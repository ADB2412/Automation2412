package accessModifiers;
class Sample{
	private int age=25;
	private void calling() //private member accessiable only within the class
	{
		System.out.println("I am calling from sample class");
	}
public static void main(String[] args) {
		Sample s1=new Sample();
		System.out.println("Age from sample class : "+s1.age);
		s1.calling();
	}

}
public class Example1 {

	public static void main(String[] args) {
		
	}

}
