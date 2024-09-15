package methodfunction;

public class Method4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//System.out.println("Intrest is : "+simpleIntrest(100000,8.5,5));
		int p=55000;
		double res=simpleIntrest( p,8.5 ,5);
		System.out.println("Intrest is :"+res);
		double finalAmount=p+res;
		System.out.println("final Amount :"+finalAmount);
		System.out.println("Program Starts");
		

	}
	static double simpleIntrest(int p,double r,int t) {
		System.out.println("principal is "+p);
		System.out.println("principal is "+r);
		System.out.println("principal is "+t);
		double intrest=(p*t*r)/100;
		return intrest;
	}

}
