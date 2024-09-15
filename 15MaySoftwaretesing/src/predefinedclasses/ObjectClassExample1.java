package predefinedclasses;
class Demo extends Object{
	void calling() {
		System.out.println("I am calling you....");
	}
}
public class ObjectClassExample1 extends Demo {
     void display() {
    	 System.out.println("I am Displaying....");
     }
	public static void main(String[] args) {
		ObjectClassExample1 ref1=new ObjectClassExample1();
		System.out.println("ref1:"+ref1);
		System.out.println("ref1:"+ref1.hashCode());
		//or 
		//System.out.println("ref1:"+ref.toString());
		
		ObjectClassExample1 ref2=new ObjectClassExample1();
		System.out.println("ref2:"+ref2.toString());
		System.out.println("ref2:"+ref2.hashCode());
		
		System.out.println("Ref compared with ref2 : "+ref1.equals(ref2));
		
		

		ObjectClassExample1 ref3=ref1;
		System.out.println("ref3:"+ref3.toString());
		System.out.println("ref3:"+ref3.hashCode());
		
		System.out.println("Ref compared with ref3 : "+ref1.equals(ref3));
	}

}
