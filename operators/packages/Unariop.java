package operators.packages;

public class Unariop {
	public static void main(String args[]) {
		// Unary operator p++,p--,++p,--p,~,!
		
		int a=5;
		int b=2;
		boolean flag=true;
		flag=!flag;
		flag=!(a<b);
		System.out.println(flag);
		System.out.println("-----------");
		int ac=~a;//a*-1-1
		System.out.println(ac);
		
		System.out.println("----------");
		
		int ab=++a;
	System.out.println(ab);
	System.out.println(a);
		
		
		System.out.println("--------");
		
		int d=b--;
		System.out.println(d);
		System.out.println(b);
		
		System.out.println("---------");
		
		int c=a++;
		System.out.println(c);
		System.out.println(a);
		
		
	}

}
