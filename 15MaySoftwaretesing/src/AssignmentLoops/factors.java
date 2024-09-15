package AssignmentLoops;

public class factors {

	public static void main(String[] args) {
		int num=10;
		System.out.println("factors of num: "+num);
        for(int i=1; i<=num; i++)
        {if (num%i==0) {
        	System.out.print(i+",");
        }
        	
        }
        System.out.println("**********************");
        int num1=-10;
        		for (int i=num1;i<=-(num1);i++) {
        			if(i!=0) {
        				if(num1%i==0) {
        					System.out.println(i+ " ");
        					
        				}
        			}
        		}
	}

}
