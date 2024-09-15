package overriding;
class Maharashtra{
	void famousFor() {
		System.out.println("Financial capital of India");
	}
}
class Pune extends Maharashtra{
	void famousFor() {
		System.out.println("Pune famous For IT");	
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		Maharashtra obj1=new Maharashtra();
		obj1.famousFor();
		Pune obj2=new Pune();
		obj2.famousFor();
		Maharashtra obj3=new Pune();
		obj3.famousFor();

	}

}
