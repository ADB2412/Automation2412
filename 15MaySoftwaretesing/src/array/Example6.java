package array;
class Demo1{
	int num1,num2;
	Demo1(){
		System.out.println("I am zero param Cons");
	}
	Demo1(int x){
		System.out.println("I am int parama cons");
		num1=x;
	}
	Demo1(int x,int y){
		System.out.println("I am int-int param cons"); 
		num1=x;
		num2=y;
		
	}
	void callingNumbers() {
		System.out.println("Numbers are num1:"+num1+" & num2: "+num2);
	}
}
public class Example6 {

	public static void main(String[] args) {
		//Demo1 ref1=new Demo1();
		Demo1[] ref=new Demo1[4];//Non primitive array of Demo1 class type
		//ref1.callingNumbers();
		ref[0]=new Demo1();
		ref[1]=new Demo1(25);
		ref[2]=new Demo1(75,25);
		 
		ref[0].callingNumbers();
		ref[1].callingNumbers();
		ref[2].callingNumbers();
		
		//Demo1 ref2=new Demo1(25);
		//ref2.callingNumbers();
		
		//Demo1 ref3=new Demo1(75,25);
		//ref3.callingNumbers();

	}

}
