package $Array;

public class Example3 {

	public static void main(String[] args) {
     int num[]= {10,20,30};
     System.out.println("Number of elements in array : "+num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
      System.out.println("***** Array Elements using for loop *****");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
     
		 System.out.println("***** Array Elements using for loop Reverse order *****");
			for(int i=num.length-1;i>=0;i--) {
				System.out.println(num[i]);
			}
         System.out.println("****** array elements using for-each loop");
         
		for(int x:num) {
			System.out.println(x);
		}
		
     System.out.println("******array char type *******");
     char[] getArray ={'A','B','C','D',};
     for (char alphabet: getArray) {
    	 System.out.println(alphabet); 
     }
     System.out.println("******array char type reverse order*******");
     char[] getReverse ={'A','B','C','D',};
     int arr=getReverse.length;
     for(int i=arr-1; i>=0;i--) {
    	 System.out.println(getReverse[i]);
    	 
     }

}
}