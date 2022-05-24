package stringclasspractice;

public class StringCreationPractice {

	public static void main(String[] args) {
		
		
		
		String s1="Hello";
		String s2= new String("world");
		System.out.println(s1+" "+s2);
		String s3="Hello";
		String s4=new String("Hello");
		if(s1==s3)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		
		if(s3==s4)
		{
			System.out.println("Same");
		}
		else
			System.out.println("Not Same");
	}

}
