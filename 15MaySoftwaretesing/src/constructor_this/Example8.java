package constructor_this;

public class Example8 {
	Example8(){
		this(25);
		System.out.println("I am zero-param cons");
	}
	Example8(int num){
	
		System.out.println("I am int-param cons");
	}
	Example8(double num){
		this(25,2500.56);
		System.out.println("I am double-param cons");
	}
	Example8(int num1,double num2){
		this();
		System.out.println("I am int-double-param cons");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		//Example8 ref1=new Example8();
		//Example8 ref2=new Example8(25);
		Example8 ref3=new Example8(25000.36);
		
		//Example8 ref4=new Example8(25,65000.54);
		
		System.out.println("Program Ends");
		

	}

}
/*output in the following way
 * int-param
 * zero-param
 *int-double-param
 *double -param
*/