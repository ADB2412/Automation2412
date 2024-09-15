package finalKeyword;

public class Example2 {
static int num1;
int num2;
static {
	System.out.println("*************SIB-1***********");
	num1=25;
}
 {
	System.out.println("*************SIB-1***********");
	num2=50;
}
static void calling() {
	System.out.println("I am calling method and SGV num1 is :"+num1);
}
void display() {
	System.out.println("I am display method and NSGV num2 is: "+num2);
}
	public static void main(String[] args) {
		System.out.println("Program starts");
		calling();
		Example2 ref=new Example2();
		ref.display();
		System.out.println("Program Ends");

	}

}
