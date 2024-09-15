package predefinedclasses2;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
	  Scanner scn=new Scanner(System.in);
	  
      int num1, num2,res;
      System.out.println("Enter Number 1");

      num1=scn.nextInt();
      
      System.out.println("Enter Number 2");

      num2=scn.nextInt();
      
      
      res=num1+num2;
      System.out.println("Addition of Two Number:"+res);

	}

}
