package interfacekeyword;
 interface Demo1{
	void calling(); 
 }
 interface Demo2{
	void calling(); 
 }
 interface Demo3{
	 void display();
	 int getNumber();
 } class Testing implements Demo1,Demo2{
	 public void calling() {
		 System.out.println("I am calling you ");
	 }
 }
public class Example3 extends Testing implements Demo3 {
public void display() {
	System.out.println("I am displaying");
}
public int getNumber() {
	return 123;
}
	public static void main(String[] args) {
	 Testing t1=new Testing();
	 t1.calling();
	 Demo1 d1 =new Testing();
	 d1.calling();
	 Demo2 d2=new Testing();
	 d2.calling();
	 Demo1 ref1=new Example3();
	 ref1.calling();
	 Demo2 ref2=new Example3();
	 ref2.calling();
	 Demo3 ref3=new Example3();
	 System.out.println(ref3.getNumber());
	 ref3.display();
     Example3 ref4=new Example3();
     ref4.display();
     System.out.println(ref4.getNumber());
     ref4.calling();
     
	}

}
