package Assignmentwhileloop;

public class Countdigit {

	public static void main(String[] args) {
		int num=1234,count=0;
		while(num>0) {
		num=num/10;
		
		count++;
		}System.out.println("Number of digits in given number is : "+count);

	}

}
/*int num=12345,count=0;
for(;num!=0;) {
num=num/10;
count++; */