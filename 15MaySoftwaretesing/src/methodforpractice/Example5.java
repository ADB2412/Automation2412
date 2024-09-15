package methodforpractice;

public class Example5 {

	public static void main(String[] args) {
		Example5 ref=new Example5();
		ref.addTwoNumber();
		ref.addTwoNumberWithParam(25, 35);
        ref.simpleIntrest(55000, 8.5, 5);
        System.out.println(ref.simpleIntrest(55000, 8.5, 5));
        double result=ref.simpleIntrest(55000, 8.5, 5);
        System.out.println(result);
	}

	double simpleIntrest(int p, double r, int t) {
		System.out.println("Principal Is :- " + p);
		System.out.println("time  Is :- " + t);
		System.out.println("ROI Is :- " + r);
		double interest = (p * t * r) / 100;
		return interest;
	}

	int getReverseNumber(int num) {
		int rev = 0, rem;
		System.out.println("Original Number is : " + num);
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	void addTwoNumber() {
		int num1 = 10, num2 = 20, res = num1 + num2;
		System.out.println("Number 1 is :- " + num1);
		System.out.println("Number 2 is :- " + num2);
		System.out.println("Result is :- " + res);
	}

	void addTwoNumberWithParam(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("Number 1 is :- " + num1);
		System.out.println("Number 2 is :- " + num2);
		System.out.println("Result is :- " + res);
	}

}
