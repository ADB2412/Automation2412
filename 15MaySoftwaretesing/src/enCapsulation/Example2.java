package enCapsulation;
class Encap2{
	private int num1=25,num2=30;
	private char grade='A';
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Encap2 e2=new Encap2();
		System.out.println("Num1:"+e2.getNum1());
		e2.setNum1(55);
		System.out.println("updated Num1:"+e2.getNum1() );
		e2.getNum2();
		System.out.println("Num2:"+e2.getNum2());
		e2.setNum2(100);
		System.out.println("updated Num2:"+e2.getNum2() );
		e2.getGrade();
		System.out.println("Grade:"+e2.getGrade() );
		e2.setGrade('B');
		System.out.println("updated Grade:"+e2.getGrade() );
	}

}
