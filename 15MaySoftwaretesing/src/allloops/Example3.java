package allloops;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("****Nusted IF-ELSE*****");
        int age=18;
        char bldgrp='B';
        if(age>=18) {
        	System.out.println("Welcome you are eligible for next checkup");
        	if(bldgrp=='B' || bldgrp=='b') {
            System.out.println("you are allowed to donate your blood");
        	}else {
        		System.out.println("sorry your blood grp does not matched");
        	}
        }else {
        	System.out.println("sorry your age is below 18");
        	
        }
	}

}
