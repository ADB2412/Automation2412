package constructor_this;

public class Example6 {
	Example6(){
		System.out.println("I am zero-param cons");
	}
	Example6(int num){
		System.out.println("I am int-param cons");
	}
	Example6(double num){
		System.out.println("I am double-param cons");
	}
	Example6(int num1,double num2){
		System.out.println("I am int-double-param cons");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example6 ref1=new Example6();
		Example6 ref2=new Example6(25);
		Example6 ref3=new Example6(25000.36);
		Example6 ref4=new Example6(25,65000.54);
		
		System.out.println("Program Ends");
		

	}

}
