package array;

public class Example9 {

	public static void main(String[] args) {
		// create an array
		int[] age= {12,4,25,2,5};
		System.out.println("Accessing Elements of array:");
		System.out.println("first Elements:"+age[0]);
		System.out.println("second Elements:"+age[1]);
		System.out.println("third Elements:"+age[2]);
		System.out.println("fourth Elements:"+age[3]);
		System.out.println("fifth Elements:"+age[4]);
		System.out.println("array size:"+age.length);
		System.out.println("*****Using For loop: ");
		for (int i=0;i<age.length;i++) {
			if (age[i]==25) {
				System.out.println(age[i]+" is present at index "+i);
				break;
			}
		}
		System.out.println("******using for each loop:");
		for(int a:age) {
			if(a==25) {
				System.out.println(a);
				break;
			}
		}
	}
	

}
