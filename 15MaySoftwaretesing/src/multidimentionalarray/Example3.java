package multidimentionalarray;

import java.util.Arrays;

public class Example3 {
    //Java program to clone the array
	public static void main(String[] args) {
		int array[]= {33,3,4,5};
		System.out.println("Printing Orignal Array:");
		for(int i :array) {
			System.out.println(i+" ");
		}
		System.out.println("\nPrinting clone of the array:");
		int cloneArray[]=array.clone();
		for(int i : cloneArray) {
			System.out.println(i+ " ");
		}
        System.out.println("\n are both equal arr and carr ?");
        System.out.println("array and clone Array content validation:"+Arrays.equals(array, cloneArray));
	}

	
}
