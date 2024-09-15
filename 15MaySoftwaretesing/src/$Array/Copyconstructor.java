package $Array;

public class Copyconstructor {
	int num1,num2;
	Copyconstructor(int x,int y){
		num1=x;
		num2=y;
	}
	
	Copyconstructor(Copyconstructor c1){
		num1=c1.num1;
		num2=c1.num2;
		
	}
	
	public static void main(String[] args) {
		
		Copyconstructor ref1=new Copyconstructor(10,20)	;
		System.out.println("num1 using ref1 object"+ref1.num1);
		System.out.println("num1 using ref1 object"+ref1.num2);
       
		//object by refernce or Copyconstructor
		Copyconstructor ref2=new Copyconstructor(ref1);
		System.out.println("num1 using ref2 object"+ref2.num1);
		System.out.println("num1 using ref2 object"+ref2.num2);
        
	}

}
