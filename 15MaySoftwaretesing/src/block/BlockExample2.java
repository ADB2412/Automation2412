package block;

public class BlockExample2 {
    {
	   System.out.println("*****Non Static Initialization Block1*****");
   }
    BlockExample2(){
    	System.out.println("I am zero param cons...");
    }
	public static void main(String[] args) {
		System.out.println("program strats");
		BlockExample2 ref1=new BlockExample2();
		System.out.println("****************************************");
		BlockExample2 ref2=new BlockExample2();
		System.out.println("****************************************");
		
		System.out.println("program ends");

	}
	{
		   System.out.println("*****Non Static Initialization Block2*****");
	   }
	{
		   System.out.println("*****Non Static Initialization Block3*****");
	   }	
	{
		   System.out.println("*****Non Static Initialization Block4*****");
	   }

}
