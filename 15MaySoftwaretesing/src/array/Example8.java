package array;

public class Example8 {

	public static void main(String[] args) {
		int a[];
		a=new int[5];
		//or 
		// int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		System.out.println("***after Initilization ****");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}

}
