package inheritance_Practice;
class GrandFather1{
	void home() {
		System.out.println("Grandfather1's home");
	}
}
class GrandFather2{
	void car() {
		System.out.println("GrandFather2's car" );
	}
}
class Child1 extends GrandFather1,GrandFather2{
	//Multiplle Inheritance using class is not possible
	// default constructor with super()
}
public class Example7 {

	public static void main(String[] args) {
		Child1 c1=new Child1();

	}

}
