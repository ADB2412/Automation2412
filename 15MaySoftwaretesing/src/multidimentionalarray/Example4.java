package multidimentionalarray;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		// Declaring source array 
		char[] copyFrom= {'d','e','c','a','f','f','e','i','n','a','t','e','d',};
		System.out.println("Elements count in copyFrom array:" +copyFrom.length);
		//Declaring destination array
		char[] copyTo=Arrays.copyOf(copyFrom,5);
        System.out.println("Elements countin copyTo array :"+copyTo.length);
        for(int i=0;i<copyTo.length;i++) {
        	System.out.print(copyTo[i]+" ");
        }
        System.out.println("\n****** Copy using range********");
        char[] copyWithRange=Arrays.copyOfRange(copyFrom, 2, 7);
        for(int i=0; i<copyWithRange.length;i++) {
        	System.out.print(copyWithRange[i]+" ");
        }
        System.out.println("\n*********after sorting*******");
        Arrays.sort(copyWithRange);
        for(char c: copyWithRange) {
        	System.out.print(c+" ");
        }
	}

}
