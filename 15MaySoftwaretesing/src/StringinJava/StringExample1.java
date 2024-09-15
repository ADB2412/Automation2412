package StringinJava;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="Pune";
		System.out.println("s1:"+s1);
		String s2="Mumbai";
		System.out.println("s2:"+s2);
        String s3="Pune";
		System.out.println("s3:"+s3);

		System.out.println("s1 compared with s2 using euals method: "+s1.equals(s2));
		System.out.println("s1 compared with s3 using euals method: "+s1.equals(s3));
		
		System.out.println("s1 compared with s2 using '==' method: "+(s1==s2));
		System.out.println("s1 compared with s3 using '==' method: "+(s1==s3));
		
		System.out.println("***********************************************");
		String s4=new String("Banglore");
		String s5=new String ("Banglore");
		System.out.println("s4 compared with s5 using euals method: "+s5.equals(s5));
		
		System.out.println("s4 compared with s5 using '==' method: "+(s4==s5));

		String s6=new String("Pune");
		System.out.println("s1 compared with s6 using euals method: "+s1.equals(s6));
		System.out.println("s1 compared with s6 using '==' method: "+(s1==s6));

		

		
	}

}
