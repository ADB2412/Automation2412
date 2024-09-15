package $Array;

import java.util.Arrays;

class PredefinedPackages1 {

	public static void main(String[] args) {
		//declaring source array
		char[] copyFrom= {'d','c','a','y','e','f','x','y','z'};
		System.out.println("Elements count in copyFrom array: "+copyFrom.length);
		//declaring destination array
		char[] copyTo=Arrays.copyOf(copyFrom, 5);
		System.out.println("Elements count in copyTo array: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+" ");
			
		}
  
		System.out.println("\n************Copy using Range************");
		char[] copyWithRange=Arrays.copyOfRange(copyTo, 2, 5);
		for(int i=0; i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i]+" ");
			
		}
		System.out.println("\n*********************after sorting******************");
		Arrays.sort(copyWithRange);//sorted in  ascending order
		for(char c:copyWithRange) {
			System.out.print(c+" ");
		}
		System.out.println("\n************************************");
		int[] array={1,4,5,8,4,9,7};
		System.out.println("printing origanal Array: ");
		for(int i:array) {
			System.out.println(i+" ");
			
			
		}
		System.out.println("\nPrinting Clone Of the Array:");
		int cloneArray[]=array.clone();
		for (int i:cloneArray) {
			System.out.println(i+" ");
			
		}
		System.out.println("\nAre both eual array And carray:");
		System.out.println("array and clone array content validation:"+Arrays.equals(array, cloneArray));
		
		
	}

}
