package AssignmentLoops;

public class Swaping {

	public static void main(String[] args) {
		int num1=10, num2=20, temp;
		System.out.println("Num1 before swapping: "+num1);
		System.out.println("Num2 before swapping: "+num2);
    temp=num1+num2;//30
    num1=temp-num1;//20
    num2=temp-num1;//10
    System.out.println("Num1 after swapping: "+num1);
	System.out.println("Num2 after swapping: "+num2);
	}

}
