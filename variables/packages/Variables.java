package variables.packages;

public class Variables {
	int age;
	String name;
	static String Country;

	public static void nonStatic()
	{
		System.out.println("Country "+Country);
		Variables v=new Variables();
		v.varUse(20,"A",Country);
	}
	public void varUse(int a,String s,String c)
	{
		nonStatic();
		age=a;
		name=s;
		Country=c;
		System.out.println("Name "+name+"\nAge "+age+" \nCountry "+Country);;
	}

}
