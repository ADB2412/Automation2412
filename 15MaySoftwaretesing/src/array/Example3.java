package array;

public class Example3 {

	public static void main(String[] args) {
		int num[]= {10,20,30};
		System.out.println("Number of elements in array: "+num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("******Array Elemnts using for loop******");
		 for(int i=0;i<num.length;i++) {
			 System.out.println(num[i]); 
		 }
		 System.out.println("******Array Elemnts using for loop in reverse******");
		 for(int i=num.length-1;i>=0; i--) {
			 System.out.println(num[i]); 
			 System.out.println("******For each loop******");	
			//for(LHS:RHS)
		     for (int x:num) {
			 System.out.println(x);
			 }
		 }
		
		
	}

}
