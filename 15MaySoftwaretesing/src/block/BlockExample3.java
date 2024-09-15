package block;

public class BlockExample3 {
    static{
	   System.out.println("*****Static Initialization Block1*****");
   }
    BlockExample3(){
    	System.out.println("I am zero param cons...");
    }
	public static void main(String[] args) {
		System.out.println("program strats");
		BlockExample3 ref1=new BlockExample3();
		System.out.println("****************************************");
		BlockExample3 ref2=new BlockExample3();
	    System.out.println("program ends");

	}
	{
		   System.out.println("*****Non Static Initialization Block2*****");
	   }
	

}
