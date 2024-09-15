package finalKeyword;

public class Example10 {
	//Whenever we declare any nonstatic global constant variable then we can initialize using non static block 
 final int num1;
 Example10(){
	 System.out.println("i am zaro param cons");
	 num1=20;
 }
	public static void main(String[] args) {
		final int age;
		System.out.println("Program starts");
		Example10 e1=new Example10();
		System.out.println("num1: "+e1.num1);
		System.out.println("Program ends");
	}

}
