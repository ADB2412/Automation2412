package methodforpractice;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//simpleIntrest(55000,8.5, 5);
		//System.out.println("intrest is :- "+simpleIntrest(55000,8.5, 5));
		int p=55000;
		double res=simpleIntrest(p,8.5, 5);
		System.out.println("Interest is :- "+res);
		double finalAmount=p+res;
		System.out.println("Amount Is :- "+finalAmount);
		System.out.println("Program Ends");

	}
	static double simpleIntrest(int p, double r, int t) {
		System.out.println("Principal Is :- "+p);
		System.out.println("time  Is :- "+t);
		System.out.println("ROI Is :- "+r);
		double interest=(p*t*r)/100;
		return interest;
	}

}
