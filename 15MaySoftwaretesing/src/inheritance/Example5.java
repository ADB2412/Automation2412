package inheritance;
class Vehicle{
	void color () {
		System.out.println("Vehicle is black");
	}
}
class Bike extends Vehicle{
	void wheels(int ct) {
		System.out.println("Bike has "+ct+" Wheels");
	}
}
class Car extends Vehicle{
void wheels(int ct) {
	System.out.println("Car has "+ct+" Wheels");
}
}
public class Example5 {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.color();
        c1.wheels(4);
        Bike b1=new Bike();
        b1.color();
        b1.wheels(2);
        
	}

}
