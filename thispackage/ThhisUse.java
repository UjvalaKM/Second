package thispackage;

public class ThhisUse {
int rollno;
String name;
static String clgname="ABC";
public ThhisUse()
{
	
}
public ThhisUse(int rollno,String name)
{
	this.rollno=rollno;
	this.name=name;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThhisUse o=new ThhisUse();
ThhisUse o1=new ThhisUse(12,"Ujvala");

o.rollno=12;
o.name="Ujvala";
		
	o.nonStaticMethod();	
	}
	
	public void nonStaticMethod()
	{
		int rollno=2;
		String name="svh";
		System.out.println("non static moethod");
		System.out.println(this.rollno);
		System.out.println(this.name);
		System.out.println(clgname);
	}
	public static void staticMethod()
	{
		System.out.println("static method");
		//System.out.println(rollna);
		//System.out.println(name);
		System.out.println(clgname);
	}

}
