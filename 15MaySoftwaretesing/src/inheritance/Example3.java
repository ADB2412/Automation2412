package inheritance;
class GrandFather{
	void myhome() {
		System.out.println("grandfather home....");
	}
}
	class Father extends GrandFather{
		Father(int num){
			System.out.println("I am Father class con...");
		}
	
		void myCar() {
			System.out.println("father car...");
		}
	}
	class Child extends Father{
		Child(){
			super(25);
			System.out.println("I am child class cons...");
		}
		void myBike() {
			System.out.println("Child bike...");
		}
	}
	

public class Example3 {

	public static void main(String[] args) {
	Child c1=new Child();
	c1.myBike();
	c1.myCar();
	c1.myhome();

	}

}
