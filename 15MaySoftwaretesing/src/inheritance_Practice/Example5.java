package inheritance_Practice;
class Fruit1{
	 Fruit1(int num){
		System.out.println("I am fruit class cons..."); 
	 }
}
class Apple1 extends Fruit1{
	 Apple1(int num){
		 super(10);
		 System.out.println("I am Apple Class cons...");
	 }
	 void shape() {
		 System.out.println("Apple round in shape");
	 }
}
public class Example5 {
     
	public static void main(String[] args) {
	 System.out.println("Program Starts");
	 Apple1 ref1=new Apple1(25);
	 ref1.shape();
	 System.out.println("Program ends");

	}

}
