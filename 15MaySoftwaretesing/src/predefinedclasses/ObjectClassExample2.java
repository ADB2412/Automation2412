package predefinedclasses;
class Demo2 {
	void calling() {
		System.out.println("I am calling you....");
	}
}
public class ObjectClassExample2 extends Demo2 {
     void display() {
    	 System.out.println("I am Displaying....");
     }
     public String toString() {
    	return "Hello" ;
     }
     public int hashCode() {
    	 return 101;
     }
     public boolean equals(Object obj) {
    	 return true;
     }
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.calling();
		System.out.println("Demo2 ref d1: "+d1);
		System.out.println("Demo2 ref d1 adress in integer: "+d1.hashCode());
		
		
		ObjectClassExample2 ref1=new ObjectClassExample2();
		System.out.println("ref1:"+ref1);
		System.out.println("ref1:"+ref1.hashCode());
		//or 
		//System.out.println("ref1:"+ref.toString());
		
		ObjectClassExample2 ref2=new ObjectClassExample2();
		System.out.println("ref2:"+ref2.toString());
		System.out.println("ref2:"+ref2.hashCode());
		
		System.out.println("Ref compared with ref2 : "+ref1.equals(ref2));
		
		

		ObjectClassExample2 ref3=ref1;
		System.out.println("ref3:"+ref3.toString());
		System.out.println("ref3:"+ref3.hashCode());
		
		System.out.println("Ref compared with ref3 : "+ref1.equals(ref3));
	}

}
