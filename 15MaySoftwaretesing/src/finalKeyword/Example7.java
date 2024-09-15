package finalKeyword;

public class Example7 {
	//Whenever we declare any static global constant variable then we can initialize using static block 
 final static int num1;
 static {
	 System.out.println("*********SIB1**********");
	 num1=25;
 }
	public static void main(String[] args) {
		final int age;
		System.out.println("Program starts");
		System.out.println("num1: "+num1);
		System.out.println("Program ends");
	}

}
