package PredefinedClassesnew;
class Demo{
	void calling() {
		System.out.println("I am calling you.....");
		
	}
}
public class ObjectClassExample2 extends Demo {
void display() {
	System.out.println("I am diplaying......");
}
	public static void main(String[] args) {
		ObjectClassExample2 ref=new ObjectClassExample2();
        System.out.println("ref:"+ref);
        
        //or
       // System.out.println("ref:"+ref.toString());
        
        ObjectClassExample2 ref2=new ObjectClassExample2();
        System.out.println("ref2:"+ref2.toString());
        System.out.println("ref2 hashcode:"+ref2.hashCode());
        
        System.out.println("Ref compared with Ref2:"+ref.equals(ref2));
         
        ObjectClassExample2 ref3=ref;
        System.out.println("ref3:"+ref3.toString());
        System.out.println("ref3 hashcode:"+ref3.hashCode());
        
        System.out.println("Ref compared with Ref2:"+ref.equals(ref3));
	}

}
