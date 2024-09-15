package methodfunction;

public class Evennumberrenge {

	public static void main(String[] args) {
		System.out.println("Program Start");
		printEvenNumber(2,20);
		System.out.println("Program Start");
        
	}
    static void printEvenNumber(int start,int end) {
    	for(;start<=end;start++) {
    		if (start%2==0) {
    			System.out.println("Even number is :"+start);
    		}
    	}
    }
}
