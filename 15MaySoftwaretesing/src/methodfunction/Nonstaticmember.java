package methodfunction;

public class Nonstaticmember {

	public static void main(String[] args) {
		System.out.println("program start");
		Nonstaticmember ref = new Nonstaticmember();
		ref.addTwoNumber();
		ref.addTwoNumberWithParam(26, 36);
		
		ref.simpleIntrest(50000, 8.5, 5);
		System.out.println(ref.simpleIntrest(50000, 8.5, 5));
		double result=ref.simpleIntrest(50000, 8.5, 5);
		System.out.println(result);
		ref.getRverseNumber(1234);
	}

	void addTwoNumber() {
		int num1 = 10, num2 = 20, res = num1 + num2;
		System.out.println("Number1 is: " + num1);
		System.out.println("Number2 is: " + num2);
		System.out.println("Result is: " + res);
	}

	void addTwoNumberWithParam(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("Number1 is: " + num1);
		System.out.println("Number2 is: " + num2);
		System.out.println("Result is: " + res);
	}

	double simpleIntrest(int p, double r, int t) {
		System.out.println("principal is " + p);
		System.out.println("principal is " + r);
		System.out.println("principal is " + t);
		double intrest = (p * t * r) / 100;
		return intrest;
	}

	int getRverseNumber(int num) {
		int rev = 0, rem;
		System.out.println("Original number is " + num);
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}
}