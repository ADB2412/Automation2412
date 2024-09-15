package inheritance_Practice;
class GrandFather {
	void myHome() {
		System.out.println("Grandfather Home...");
	}
}
class Father extends GrandFather{
	Father(int num){
		System.out.println("I am father Class Cons...");
	}
	void myCar() {
		System.out.println("Father car...");
	}
}
class Child extends Father{
	Child(){
		super(25);
		System.out.println("I am child class cons...");
	}
	void myBike() {
		System.out.println("Child Bike...");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child c1=new Child();
         c1.myBike();
         c1.myCar();
         c1.myHome();
	}

}
