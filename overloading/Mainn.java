package overloading;

public class Mainn extends Overloading7 {
Mainn()
{
	//super(10);
	System.out.println("M");
	
}
Mainn(int a)
{
	this();
	System.out.println(" M a");
	
}
static void staticMethod()
{
	System.out.println("Child Static Method");
}
 void nonStaticMethod()
{
	System.out.println(" Child Non Static Method");
}

public static void main(String a[])
{
	Overloading7  m=new Mainn(10);
	m.staticMethod();
	m.nonStaticMethod();
}

	}

