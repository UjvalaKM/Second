package first.packages;

public class MyFirstClass {
int a=10;
int b=20;
char c='c';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass mfc=new MyFirstClass();
System.out.println("Welcome to java world");
System.out.println("value of a "+mfc.a+" value of C  "+mfc.c);
Second s=new Second();
int add=s.add(mfc.a,mfc.b);
System.out.println("Addition"+add);
	}

}
