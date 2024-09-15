package methodfunction;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int x=123;
		//getRverseNumber(x);
		//System.out.println("Reverse number is : "+getRverseNumber(x));
		int temp=getRverseNumber(x);
		System.out.println("Reverse number is : "+temp);
		System.out.println("Program ends");
		

	}
        // WAM TO GET REVERSE NUMBER OF GIVEN NUMBER
	     static int getRverseNumber(int num)
	     {
		int rev=0,rem;
		System.out.println("Original number is "+num);
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}
