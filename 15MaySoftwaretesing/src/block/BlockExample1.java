package block;

public class BlockExample1 {
   static {
	   System.out.println("*****Static Initialization Block1*****");
   }
	public static void main(String[] args) {
		System.out.println("program strats");
		System.out.println("program ends");

	}
	static {
		   System.out.println("*****Static Initialization Block2*****");
	   }
	static {
		   System.out.println("*****Static Initialization Block3*****");
	   }

}
