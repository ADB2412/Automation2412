package overriding;
class Bank{
	int numberOfAccountTypeAvailable=2;
	double homeLoanRoi() {
		return 6.5;
				
	}
}
class SBI extends Bank{
	int numberOfAccountTypeAvailable=5;
	double homeLoanRoi() {
		return 9.5;
	
}
	void accountType() {
		System.out.println("Saving.....");
		System.out.println("SBI numberOfAccountTypeAvailable: "+numberOfAccountTypeAvailable);
		//Bank b1=new Bank();
		//System.out.println("Bank numberOfAccountTypeAvailable: "+b1.numberOfAccountTypeAvailable );
		System.out.println("Bank numberOfAccountTypeAvailable: "+super.numberOfAccountTypeAvailable );
	    System.out.println("SBI homeLoanRoi: "+homeLoanRoi());
	    System.out.println("Bank homeLoanRoi : "+super.homeLoanRoi());
	}
}
public class Example6 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.accountType();

	}

}
