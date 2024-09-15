package inheritanceAssignment;
class getReversenum{
	static int rverseNumber(int num1) {
		int rev=0,rem;
		System.out.println("Original number is "+num1);
		while(num1!=0) {
			rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
	}
		return rev;
	}
		int palindrome(int abc1) {
			int abc1=121,rev=0, rem,temp;
			temp=abc1;
			System.out.println("original number is : "+abc1);
	        while(abc1!=0) {
	        	rem=abc1%10;
	        	rev=rev*10+rem;
	        	abc1=abc1/10; 
	        }System.out.println("reverse number is "+rev);
	         if(rev==temp) {
	        	 System.out.println("Given number is palin");
	         }else {
	        	 System.out.println("Given number is not a palin");
	         }
		}
		int leapYear(int yr) {
			int yr=2002;
			if((yr%4==0 && yr%100!=0)|| (yr%400==0)) {
				System.out.println("Given year is leap year :" +yr);
			}else {
				System.out.println("Given year is not a leap year: " +yr);
			}
	
		}
		
		
}
	
public class Example1Inheritance {

	public static void main(String[] args) {
		
		
		
		
	

	}

}
