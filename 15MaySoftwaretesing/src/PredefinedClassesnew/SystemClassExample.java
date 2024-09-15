package PredefinedClassesnew;
class Testing{
	void calling() {
		System.out.println("I am testing class Calling");
	}
}
public class SystemClassExample {
	
	static Testing ref=new Testing();
	
	
	public static void main(String[] args) {
		//Testing ref=new Testing();
		//ref.calling();
		
		
		SystemClassExample.display();
		
		SystemClassExample.ref.calling();

        System.out.println("Hello");
        
        System.err.println("I am Error msg");
        
	}
	
   
	static void display() {
		System.out.println("I am displaying Of systemClassExample");
	}
}
