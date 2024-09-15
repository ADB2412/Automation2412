package overriding;
class Maharastra1{
	int itcompnies=120;
	void famousFor() {
		System.out.println("Financial capital of India");
	}
}
class Pune1 extends Maharastra1{
	int itcompnies=55;
	void famousFor() {
		System.out.println("Pune famous For IT");	
	}
	void famousFood() {
		System.out.println("Pune Is Famous for Misal");
		System.out.println("Pune It Compnies :"+itcompnies);//55
		famousFor();//It will execute Pune Class method
		
		Maharastra1 obj=new Maharastra1();
		System.out.println("Maharastra IT compnies: "+obj.itcompnies);
		obj.famousFor();
	}
	
}

public class Example4 {

	public static void main(String[] args) {
		Pune1 obj3=new Pune1();
		obj3.famousFood();

	}

}
