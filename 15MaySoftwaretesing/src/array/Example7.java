package array;
class Sample{
	int age;
	double salary;
	Sample(){
		System.out.println("zero param");
	}
	Sample(int a){
		age=a;
		System.out.println("int param");
	}
	Sample(double a){
		salary=a;
		System.out.println("double param");
	}
	void calling() {
		System.out.println("Calling of Sample class ,age: "+age);
		System.out.println("calling Of Sample class ,salary: "+salary);
	}
}
public class Example7 {

	public static void main(String[] args) {
    System.out.println("*************");
    Sample e2=new Sample();
    Sample e3=new Sample(15);
    Sample e4=new Sample(25.36);
    e2.calling();
    e3.calling();
    e4.calling();
    
    System.out.println("***************");
    // or 
    
     //Sample[] e=new Sample[] {new Sample(),new Sample(15),new Sample(25.36)};
     //or
    
   // Sample[] e= {new Sample(),new Sample(15),new Sample(25.36)};
    //or
    
     Sample[] e=new Sample[3];
     e[0]=new Sample();  // e2
     e[1]=new Sample(15);  // e3
     e[1]=new Sample(25.36); // e4
     e[0].calling();  //e2.calling();
     e[1].calling();  //e3.calling();
     e[2].calling();  //e4.calling();

}
}