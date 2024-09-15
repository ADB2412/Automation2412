package multidimentionalarray;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		// Java Program to clone the array
		int array[]= {33,3,4,5};
		System.out.println("Printing Orignal Array : ");
        for(int i: array ) {
        	System.out.print(i+ " ");
        }
        System.out.println("\nPrinting clone of the array: ");
        int cloneArray[]=array.clone();
        for(int i : cloneArray) {
        	System.out.print(i+" ");
        }
        System.out.println("\n Are both equal arr and carr");
        System.out.println("array and Clonearray content validation :"+Arrays.equals(array,cloneArray));
        System.out.println("**************************************");
        int newCopiedArray[]=Arrays.copyOf(array, array.length);
        for (int i : newCopiedArray) {
        	System.out.print(i+" ");
        }
        System.out.println("\n********************************");
        int newCopiedRangeArray[]=Arrays.copyOfRange(array, 1, 2);
        for (int i : newCopiedRangeArray) {
        	
        }
	}

}
