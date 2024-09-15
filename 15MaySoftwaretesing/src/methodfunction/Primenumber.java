package methodfunction;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println(chekPrimeNumber(5));
		System.out.println(chekPrimeNumber(7));
		System.out.println(chekPrimeNumber(11));
		System.out.println("Program Ends");
	}
	static boolean chekPrimeNumber(int num) {
		int ct=0,i=1;
				boolean result;
		while (i<=num) {
			if (num%i==0) {
				ct++;
			}i++;
		}
		if (ct==2) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}

        
}
