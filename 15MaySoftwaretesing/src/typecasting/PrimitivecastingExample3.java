package typecasting;

public class PrimitivecastingExample3 {

	public static void main(String[] args) {
		calling(123);
		System.out.println(cal(25.35,20));
		
	}
	static void calling (long num) {
		System.out.println("I am calling on "+num);
	}
	static int cal(double d, int num) {
		double res=d+num;
		return (int)res;
	}

}
