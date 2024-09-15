package accessModifiers;
public class Sample3{
	private int age=25;
	void calling() 
	{
		System.out.println("I am calling from sample class");
	}
	protected void printing() {
		System.out.println("I am print from sample");
	}
	public void display() {
		System.out.println("I am display from sample3");
	}
public static void main(String[] args) {
		Sample3 s1=new Sample3();
		System.out.println("Age from sample class : "+s1.age);
		s1.calling();
	}
}

class Sample4 {

	public static void main(String[] args) {
		Sample3 s1=new Sample3();
		//will get compile time error
		//System.out.println("age from sample: "+s1.age);
		s1.calling();
		s1.printing();
	}

}
