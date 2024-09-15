package AssignmentLoops;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n=153,d,i,s=0;
		for (i=n;i>0;i=i/10) {
			d=i%10;//digits
		    s=s+(d*d*d);	
		}
	if (s==n) {
		System.out.println("Armstrong Number: "+s);
	}else {
		System.out.println("Not a Armstrong Number: "+s);
	}

	}

}
