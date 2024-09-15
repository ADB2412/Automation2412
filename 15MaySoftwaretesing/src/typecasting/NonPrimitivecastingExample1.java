package typecasting;
class Fruit{
	void shape() {
		System.out.println("Fruits are round in shape");
	}
}
class Apple extends Fruit{
	void taste() {
		System.out.println("Aplles are sweet in taste");
	}
	void shape() {
		System.out.println("Apple are round in shape ");
	}
}
public class NonPrimitivecastingExample1 {

	public static void main(String[] args) {
		Fruit f1=new Fruit();
		f1.shape();
		
		Apple a1=new Apple();
		a1.taste();
		a1.taste();
		System.out.println("******Up Casting******");
	    Fruit ref=new Apple(); //implicit or auto upcasting/Fruit ref=(Fruit)new Apple();
	    ref.shape();
	    // ref.taste(); //not accessible as fruit class has only shape() method
	    Fruit ref2=(Fruit)a1;//Explicit Upcasting|Fruit ref2=(Fruit)a1;-->Fruit ref2=(Fruit)new Apple();
	    ref2.shape();
	    System.out.println("******Down casting*******");
	    //Apple ref3=new Fruit();Down casting is not possible Directly (implicit down casting is not possible)
	   Apple ref4=(Apple)ref; //Down casting is possible only for up casted object using explicit way
	   ref4.shape();
	   ref4.taste();
	}
	

}
