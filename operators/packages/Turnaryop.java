package operators.packages;

public class Turnaryop {

	public static void main(String[] args) {
		// Ternary operator(if-then-else)?:
		
boolean f1=true;
boolean f2=false;

int x=20;
int y=10;
int age=17;

String str=(age>=18)?"You can Vote":"You cannot Vote";
System.out.println(str);


char b=(x<y)?'A':'B';
System.out.println(b);


int a=f1?41:42;
System.out.println(a);


String s=f2?"Hii":"Hello";
System.out.println(s);
	}

}
