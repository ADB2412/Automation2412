package overriding;
class Maharastra101{
	int itcompnies=120;
	void famousFor() {
		System.out.println("Financial capital of India");
	}
}
class Pune101 extends Maharastra101{
	int itcompnies=55;
	void famousFor() {
		System.out.println("Pune famous For IT");	
	}
	void famousFood() {
		System.out.println("Pune Is Famous for Misal");
		System.out.println("Pune It Compnies :"+itcompnies);//55
		famousFor();//It will execute Pune Class method
		
		
//		Maharastra101 obj=new Maharastra101();
//		System.out.println("Maharastra IT compnies: "+obj.itcompnies);
//		obj.famousFor();
		
		System.out.println("Maharastra IT compnies: "+super.itcompnies);
		super.famousFor();
		
	}
	
}

public class Example5 {

	public static void main(String[] args) {
		Pune101 obj3=new Pune101();
		obj3.famousFood();

	}

}
