package PredefinedClassesnew;
class Demo2{
	void calling() {
		System.out.println("I am calling you.....");
		
	}
}
public class ObjectClassExample1 extends Demo2 {
void display() {
	System.out.println("I am diplaying......");
}
   public String toString() {
	   return "Hello";//overrided toString method
   }

   public int hashCode() {
	   return 123; //override hashCode method
   }
   public boolean equals(Object obj) {
	   return true;
   }
   
   
public static void main(String[] args) {
	Demo2 d1=new Demo2();
	System.out.println("Demo2 ref d1:"+d1);
	System.out.println("Demo2 ref d1 adress in integer:"+d1.hashCode());

	
	
		ObjectClassExample1 ref=new ObjectClassExample1();
        System.out.println("ref:"+ref);
        
        //or
       // System.out.println("ref:"+ref.toString());
        
        ObjectClassExample1 ref2=new ObjectClassExample1();
        System.out.println("ref2:"+ref2.toString());
        System.out.println("ref2 hashcode:"+ref2.hashCode());
        
        System.out.println("Ref compared with Ref2:"+ref.equals(ref2));
         
        ObjectClassExample1 ref3=ref;
        System.out.println("ref3:"+ref3.toString());
        System.out.println("ref3 hashcode:"+ref3.hashCode());
        
        System.out.println("Ref compared with Ref2:"+ref.equals(ref3));
	}

}
