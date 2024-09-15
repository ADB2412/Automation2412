package array;

public class Example4 {

	public static void main(String[] args) {
		/*
		 deceration
		 int a[];
		 //size initialization
		   a=new int[5];
		 */
            //or
		int a[]=new int[5];//decleration and initilization
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;//initilization
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		System.out.println("*****After Initilization *****");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//or
		System.out.println("Array Elements counts: "+a.length);//5
		System.out.println("*****Normal For Loop*****");
		//traversing array
		for(int i=0;i<a.length;i++)// length is the property of array
		{
			System.out.println(a[i]);
			
		}
		System.out.println("****for each loop*****");
		for(int num:a)
		{
			System.out.println(num);
			
		}
		char[] getArray=new char[] {'A','B','C','D'};
        //OR
		char[] getArray1=new char[4];
		getArray[0]='A';
		getArray[1]='B';
		getArray[2]='C';
		getArray[3]='D';
		//OR 
		char[] getArray2 = {'A','B','C','D'};
		System.out.println("******for each loop--5******");
		for (char num:getArray) {
			System.out.println(num);
		}
		
		

}
}