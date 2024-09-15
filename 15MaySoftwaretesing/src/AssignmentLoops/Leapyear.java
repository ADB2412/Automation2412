package AssignmentLoops;

public class Leapyear {

	public static void main(String[] args) {
		int yr=2002;
		if((yr%4==0 && yr%100!=0)|| (yr%400==0)) {
			System.out.println("Given year is leap year :" +yr);
		}else {
			System.out.println("Given year is not a leap year: " +yr);
		}

	}

}
