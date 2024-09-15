package constructor_this;

public class Example7 {
	Example7(){
		System.out.println("I am zero-param cons");
	}
	Example7(int num){
		this();
		System.out.println("I am int-param cons");
	}
	Example7(double num){
		this(25);
		System.out.println("I am double-param cons");
	}
	Example7(int num1,double num2){
		this(25000.56);
		System.out.println("I am int-double-param cons");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		//Example7 ref1=new Example7();
		//Example7 ref2=new Example7(25);
		//Example7 ref3=new Example7(25000.36);
		
		Example7 ref4=new Example7(25,65000.54);
		
		System.out.println("Program Ends");
		

	}

}
