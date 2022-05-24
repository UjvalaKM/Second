package overloading;

public class Overloading7 {
Overloading7()
{
	System.out.println("7");
}
Overloading7(int a)
{
	System.out.println("7 a");
}
void sum(int a,long b)
{
	System.out.println("a metod invoked");
}
void sum(long a,int b)
{
	System.out.println("b method invoked");
}
static void staticMethod()
{
	System.out.println("Parent Static Method");
}
void nonStaticMethod()
{
	System.out.println(" Parent Non Static Method");
}

}
