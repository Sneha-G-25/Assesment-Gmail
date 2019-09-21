package Gmail;
import java.util.HashSet;
import java.util.Scanner;

public class Gmail_data extends Gmail1{

	static Gmail_data h = new Gmail_data();
	static HashSet<Gmail1> hs = new HashSet<Gmail1>();

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choise");
		int s = in.nextInt();
//		System.out.println(s);
		if(s==2) {
			System.out.println("Enter your name");
			Scanner in1 = new Scanner(System.in);
			String s1 = in1.nextLine();
//			in1.close();
			
			System.out.println("Enter your type");
			Scanner in2 = new Scanner(System.in);
			String s2 = in2.nextLine();
//			in2.close();
			
			System.out.println("Enter your employe id");
			Scanner in3 = new Scanner(System.in);
			int s3 = in3.nextInt();
//			in3.close();
			
			Gmail1 out = h.regData(s1,s2,s3);
			hs.add(out);
			System.out.println(hs);
			System.out.println("jhdksdhf");


		}
		else if(s==1) {
			
			System.out.println("Enter your email");
			Scanner in4 = new Scanner(System.in);
			String s4 = in4.nextLine();
//			in4.close();
			
			System.out.println("Enter your password");
			Scanner in5 = new Scanner(System.in);
			int s5 = in5.nextInt();
//			in5.close();
		
			
			System.out.println("Enter A for compose and B to show inbox");
			Scanner in6 = new Scanner(System.in);
			char c = in6.next().charAt(0);
			
			
			System.out.println("Enter ayour message");
			Scanner in7 = new Scanner(System.in);
			String s7 = in7.nextLine();
			
		
		
		Gmail1 out1 = h.loginData(s4,s5,s7);
		hs.add(out1);
		System.out.println(hs);
	}	
	}
		

		
	
	public static Gmail1 regData( String b, String c , int d ) {

		Gmail1 r2 = new Gmail1();
		//r2.setEmail(a);
		r2.setEmpName(b);
		r2.setEmpType(c);
		r2.setEmpid(d);
		//r2.setPassword(e);
		
		return r2;
	}
	
	public static Gmail1 loginData(String s , int g ,String jk) {
		Gmail1 r3 = new Gmail1();
		r3.setEmail(s);
		r3.setPassword(g);
		r3.setMessage(jk);
		return r3;
	}
	
	

}


