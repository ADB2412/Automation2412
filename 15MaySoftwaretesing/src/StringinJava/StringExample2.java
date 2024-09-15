package StringinJava;

public class StringExample2 {

	public static void main(String[] args) {
		String s1="HelloHiBye";
		System.out.println("s1:"+s1);
		System.out.println("Char Count in given string is:"+s1.length());
		System.out.println("Char at Index 1:"+s1.charAt(1));
		System.out.println("Char at Index 5:"+s1.charAt(5));
        for(int i=0; i<s1.length(); i++) {
        System.out.println("Char at Index "+i+":"+s1.charAt(i));
     
        }
	    System.out.println("S1 in lowercase:"+s1.toLowerCase());	
	    System.out.println("S1 in lowercase:"+s1.toUpperCase());	
     
	    for(int i=s1.length()-1;i>=0 ; i--) {
	        System.out.print(s1.charAt(i));
	     
	        }
	    System.out.println("********************************");
		 System.out.println(s1.indexOf('H'));
		 System.out.println(s1.lastIndexOf('H'));
       System.out.println("**********************");
       
       String s2="  Good Evening Everyone Wlcome to our IT World   ";
       System.out.println("s2 value is: \n"+s2+"char count:"+s2.length());

       System.out.println("Remove Additional Pre and post spaces:\n"+s2.trim()+"char count:"+s2.trim().length());
       System.out.println("*************************************");
       String stringarray[]=s2.trim().split(" ");
       for(String str:stringarray)
       System.out.println(str);
       System.out.println("*************************************");
       String stringarray1[]=s2.trim().split("e");
       for(String str1:stringarray1)
       System.out.println(str1);
       
       System.out.println("*************************************");
       String stringarray2[]=s2.trim().split("e",3);
       for(String str2:stringarray2)
       System.out.println(str2);


       
	}

}
