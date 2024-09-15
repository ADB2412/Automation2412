package allloops;

public class Example8 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			i++;
			System.out.println("hello");
		}System.out.println("**********************");
		char ch='A';
		while (ch<='Z') {
			ch++;
			System.out.print(ch+ ",");
		}
         System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
         int num=10;
         while(num<=20) {
        	 if (num%2==0) {
        		 System.out.println(num);
        	 }num++;
        	 
         }System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
         int num1=5;
         while(num1<7) {
        	 System.out.println(num1);
         }
	}

}
