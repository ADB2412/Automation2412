package AssignmentLoops;

public class Primenumber {

	public static void main(String[] args) {
		int num=9,ct=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				ct++;
			}
		}
       if(ct==2) {
    	   System.out.println("Given number is prime");
       }else {
    	   System.out.println("Given number is not a prime");
       }
	}

}
