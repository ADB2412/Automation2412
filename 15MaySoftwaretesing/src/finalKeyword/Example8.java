package finalKeyword;

public class Example8 {
	//Whenever we declare any  global constant variable then we can initialize using static block 
 final int num1=10;
 
	public static void main(String[] args) {
		final int age;
		System.out.println("Program starts");
		Example8 ref=new Example8();
		System.out.println("num is : "+ref.num1);
		System.out.println("Program ends");
	}

}
