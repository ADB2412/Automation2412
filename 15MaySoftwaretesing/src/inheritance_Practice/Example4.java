package inheritance_Practice;
class Fruit{
	 Fruit(){
		System.out.println("I am fruit class cons..."); 
	 }
}
class Apple extends Fruit{
	 Apple(int num){
		 //super() --default
		 System.out.println("I am Apple Class cons...");
	 }
	 void shape() {
		 System.out.println("Apple round in shape");
	 }
}
public class Example4 {
     
	public static void main(String[] args) {
	 System.out.println("Program Starts");
	 Apple ref1=new Apple(25);
	 System.out.println("Program ends");

	}

}
