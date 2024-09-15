package Assignmentwhileloop;

public class Palindrome {

	public static void main(String[] args) {
		int num1=121,rev=0, rem,temp;
		temp=num1;
		System.out.println("original number is : "+num1);
        while(num1!=0) {
        	rem=num1%10;
        	rev=rev*10+rem;
        	num1=num1/10; 
        }System.out.println("reverse number is "+rev);
         if(rev==temp) {
        	 System.out.println("Given number is palin");
         }else {
        	 System.out.println("Given number is not a palin");
         }

	}

}
