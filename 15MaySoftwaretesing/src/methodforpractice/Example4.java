package methodforpractice;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("is given number prime :-"+checkPrime(5));
		System.out.println("is given number prime :-"+checkPrime(11));
		printEvenNumberFromRange(5,20);
	}
    static boolean checkPrime(int num) {
    	int ct=0,i=1;
    	boolean result;
    	while(num>=i) {
    		if (num%i==0) {
    			ct++;
    		}
    		i++;
    	}
    	if (ct==2) {
    		result=true;
    	}
    	else {
    		result=false;
    	}
    	return result;
    }
    static void printEvenNumberFromRange(int start, int end) {
    	for (;start<=end;start++) {
    		if (start%2==0) {
    			System.out.println("Even Number is : "+start);
    		}
    	}
    }
}
