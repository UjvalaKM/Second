package stringclasspractice;

public class StringCreationPractice2 {

	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=s1.intern();
		String s3="Hello";
		
		if(s3==s2)
		{
			System.out.println("Same");
			
		}
		else
			System.out.println("Not Same");
	}

}
