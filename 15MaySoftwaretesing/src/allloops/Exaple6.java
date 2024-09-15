package allloops;

public class Exaple6 {

	public static void main(String[] args) {
		System.out.println("****for loops*****");
		for (int i=1;i<=3;i++) {
			System.out.println("*************"+i+"*************");
			System.out.println("wlecome to Automation session");
			System.out.println("you are learning core java");
			System.out.println("will satrt selenium after this");
		}System.out.println("*************************************");
		for(int i=0; i<=5;i++) {
			System.out.println(i);
			}
		System.out.println("**********************************");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}System.out.println("**********************************");
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}System.out.println("******************************");
			for(char ch='A';ch<='Z';ch++) {
				System.out.print(ch+",");
			}
			
		}System.out.println("\n**************A to Z*************************");
		
		for(char ch='A'; ch<='Z';ch++) {
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.print(ch+ ",");
			}
				
		}
	}

}
