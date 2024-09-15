package finalKeyword;

public class Example9 {
	//Whenever we declare any nonstatic global constant variable then we can initialize using non static block 
 final int num1;
  {
	 System.out.println("*********NSIB1**********");
	 num1=25;
 }
	public static void main(String[] args) {
		final int age;
		System.out.println("Program starts");
		Example9 e1=new Example9();
		System.out.println("num1: "+e1.num1);
		System.out.println("Program ends");
	}

}
