package predefinedclasses;
 class Demo101{
	void display() {
		System.out.println("I am display()...");
	}
}
public class Example1 extends Demo101 {
 static int last_roll=100;
 int roll_no;
 Example1(){
	roll_no=last_roll;
	last_roll++;
 }
	public static void main(String[] args) {
	Demo101 d1=new Demo101();
	System.out.println(d1);
	Demo101 d3=new Demo101();
	System.out.println("********************");
	Example1 s=new Example1();
	System.out.println(s);
	System.out.println(s.toString());
	System.out.println("********************");
	
	System.out.println(d3.toString());
	
	
	}

}
