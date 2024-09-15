package inheritance;
class Grandfather1{
	void home() {
		System.out.println("Grandfather1's home");
	}
}
class Grandfather2{
	void home() {
		System.out.println("Grandfather2's home");
	}
}
class Child1 extends Grandfather1,Grandfather2{
	// Multiple Inheritance using Class is not Possible in Java
}
public class Example6 {

	public static void main(String[] args) {
		Child c1=new Child();

	}

}
