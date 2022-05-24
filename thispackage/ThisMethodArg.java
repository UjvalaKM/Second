package thispackage;

public class ThisMethodArg {

	int a=90;
	String str="abcd";
	public ThisMethodArg()
	{
		System.out.println(a);
		System.out.println(str);
	}
	public ThisMethodArg(ThisMethodArg a)
	
	{
		System.out.println(a.a);
		System.out.println(a.str);
		a.a=20;
		a.str="xyz";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisMethodArg t=new ThisMethodArg();
ThisMethodArg t1=new ThisMethodArg(t);
	}
public void sample()
{
	ThisMethodArg a=new ThisMethodArg(this);
}

}

