package methodforpractice;

public class Example1 {

	public static void main(String[] args) {
	System.out.println("program Starts");
	addTwoNumber();// direct approach
	Example1.addTwoNumber();// standard approach by using class name
	Example1.addTwoNumberWithParam(20,30);// standard approach by using class name
	Example1.addTwoNumberWithParam(50,20);
	int a=20,b=40;
	Example1.addTwoNumberWithParam(a,b);
	System.out.println("program Ends");

	}
	//Add two Numbers
	static void addTwoNumber() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number 1 is :- "+num1);
		System.out.println("Number 2 is :- "+num2);
		System.out.println("Result is :- "+res);
	}
	static void addTwoNumberWithParam(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number 1 is :- "+num1);
		System.out.println("Number 2 is :- "+num2);
		System.out.println("Result is :- "+res);
	}

}
