package Assignmentwhileloop;

public class Reversenmber {

	public static void main(String[] args) {
		int num1=123,rev=0, rem;
		System.out.println("original number is : "+num1);
        while(num1!=0) {
        	rem=num1%10;
        	rev=rev*10+rem;
        	num1=num1/10; 
        }System.out.println("reverse number is "+rev);
	}

}
/*
int num=123,rev=0,rem;
System.out.println("Original number Is : "+num);
for (;num!=0;) {
rem=num%10;
rev=rev*10+rem;
num=num/10; 
*/