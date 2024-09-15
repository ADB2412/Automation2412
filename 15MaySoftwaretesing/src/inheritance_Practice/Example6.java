package inheritance_Practice;
class Vehicle{
	//default construtor
	void color() {
		System.out.println("vehicle is black");
	}
}
class Bike extends Vehicle{
	//default construtor
	void wheels(int ct) {
		System.out.println("Bike has "+ct+"wheels");
	}
}
class Car extends Vehicle{
	//default construtor with super()
	void wheels(int ct) {
		System.out.println("Car has "+ct+"wheels");	
	}
}
public class Example6 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color();
		c1.wheels(4);
		Bike b1=new Bike();
		b1.color();
		b1.wheels(2);

	}

}
