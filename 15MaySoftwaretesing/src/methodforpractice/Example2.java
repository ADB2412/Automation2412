package methodforpractice;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int x=123;
		//getReverseNumber(x);
		//System.out.println("Revers Number is :- "+getReverseNumber(x));
		int temp=getReverseNumber(x);
		System.out.println("Revers Number is :- "+temp);
		System.out.println("Program Ends");

	}
	static int getReverseNumber(int num) {
		int rev=0,rem;
		System.out.println("Original Number is : "+num);
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

}
