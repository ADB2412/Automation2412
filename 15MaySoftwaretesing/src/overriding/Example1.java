package overriding;
class Vehicle{
	void color() {
		System.out.println("Vehicle is black");
	}
	void speed() {
		System.out.println("Vehicle speed will be set accordingly to its type");
	}
}
class Car extends Vehicle{
	@Override
	void color() {
		System.out.println("Car is white");
	}
	@Override
	void speed() {
		System.out.println("Car can run with 200km/hr");
	}
	void gears() {
		System.out.println("Car has 4 gears");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.color();
        v1.speed();
        Car c1=new Car();
        c1.color();
        c1.speed();
        c1.gears();
	}

}
