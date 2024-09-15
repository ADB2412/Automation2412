package methodfunction;

public class Metod2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//addTwoNumber();
		Metod2.addTwoNumber();
		System.out.println("*****************************");
		addTwoNumberWithParam(20,30);
		int a=15, b=25;
		System.out.println("******************************");
		addTwoNumberWithParam(a,b);
		System.out.println("Program ends");

	}
	static void addTwoNumber() {
		int num1=10, num2=20, res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
	static void addTwoNumberWithParam(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Numb1 is: "+num1);
		System.out.println("Numb2 is: "+num2);
		System.out.println("Result1 is: "+res);
	}


    
}
