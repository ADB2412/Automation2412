package typecasting;

public class PrimitivecastingExample1 {

	public static void main(String[] args) {
	calling(123);
	System.out.println(cal(25.35,20));
	}

	static void calling(long num)//long num=123;implicit-widening
	{
		System.out.println("I am calling on "+num);
	}
	static int cal(double d,int num) {
		double res=d+num;
		return (int)res;//narrowing explicit
	}

}
