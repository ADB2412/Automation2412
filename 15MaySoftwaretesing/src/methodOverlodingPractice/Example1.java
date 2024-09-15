package methodOverlodingPractice;

public class Example1 {

	public static void main(String[] args) {
		addNumber();
		System.out.println("**********************");
		addNumber(15.50,25);
		System.out.println("***********************");
		addNumber(15,25);
		System.out.println("************************");
		addNumber(15,25.36);

	}
	static void addNumber() {
		int num1=10,num2=20, res=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("result is : "+res);
	}
	static void addNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("result is : "+res);
	}
	static void addNumber(double num1, int num2) {
		double res=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("result is : "+res);
	}
	static void addNumber(int num1, double num2) {
		double res=num1+num2;
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("result is : "+res);
	}

}
