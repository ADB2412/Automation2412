package enCapsulation;
class Encap {
	private int age=25;
	private double salaray=45000;
	public int getAge() {
		return age;
	}
	public double getSalaray() {
		return salaray;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salaray=salary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Encap e1=new Encap();
		//you will get compile time error if you directly try to access private data members of Encape class
		//System.out.println(e1.age);//comiletime error
		//System.out.println(e1.salary);//comiletime error
        System.out.println("Using getter concept ,private age from Example1 class:"+e1.getAge());
        System.out.println("Using getter concept ,private salaray from Example1 class:"+e1.getSalaray());
       
        e1.setAge(50);
        e1.setSalary(85000);
        System.out.println("Updated Using setter concept ,private age from Example1 class:"+e1.getAge());
        System.out.println("Updated Using setter concept ,private salaray from Example1 class:"+e1.getSalaray());
	}

}
