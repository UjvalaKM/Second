package operators.packages;

public class Assignop {

	public static void main(String[] args) {
		//Assignment operators =,+=,-=,*=,/=,%=,<<=,>>=
		int a=5;
		int b=4;
		
		b>>=a;//b=b>>a;
		System.out.println(b);
		
		b<<=a;//b=b<<a;
		System.out.println(b);
		
		b%=a;//b=b%a
		System.out.println(b);
		
		b/=a;//b=b/a
		System.out.println(b);
		
		b*=a;//b=b*a
		System.out.println(b);
		
		b-=a;//b=b-a
		System.out.println(b);
		
		
		b+=10;//b=b+a
		System.out.println(b);
		b+=a;//b=b+a;
		System.out.println(b);
		

	}

}
