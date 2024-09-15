package overriding;
class Person{
	void talking() {
		System.out.println("Person is talking in English");
	}
	void eating() {
		System.out.println("Person can eats fruits");
	}
}
class Men extends Person{
	//virtual method/inherited method :talking()
	@Override
	void eating() {
		System.out.println("Men can eat wadapav");
	}
	void sports() {
		System.out.println("Men paly Football");
	}
}
public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("*******Object and Reference of Person Class******* ");
        Person obj1=new Person();
        obj1.talking();
        obj1.eating();
        System.out.println("*******Object and Reference of Men Class******* ");
        Men obj2=new Men();
        obj2.talking();
        obj2.eating();
        obj2.sports();
        System.out.println("*******Object of Men class and Reference of Person Class******* ");
        Person obj3=new Men();
        obj3.talking();
        obj3.eating();
        System.out.println("Program Ends");
	}

}
