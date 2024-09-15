package Assignmentwhileloop;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n=153,i,sum=0;
		i=n;
		while(n>0) 
		{
		int d=n%10;
		sum=sum+(d*d*d);
		n=n/10;
		}
		if(sum==i) {
			System.out.print("armstrong number : "+i);
		}else {
			System.out.print("not armstrong number: "+i);
		}
			}

}
