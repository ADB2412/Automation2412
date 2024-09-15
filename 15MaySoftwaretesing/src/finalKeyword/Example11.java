package finalKeyword;
class Sample{
	static int num1=45;
	int num2=25;
}
public class Example11 {
	static int num1=75;
	int num2=95;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Example11 calss num1 variable valu is : "+Example11.num1);
		System.out.println("sample calss num1 variable valu is : "+Sample.num1);
		
		Sample s1=new Sample();
		System.out.println("Sample class num2 variable value is: "+s1.num2);
		Example11 e1=new Example11();
		System.out.println("Example11 class variable value is : "+e1.num2);
		System.out.println("Program Starts");

	}

}
