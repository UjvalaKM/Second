package stringclasspractice;

public class StringPractice {

	public static void main(String[] args) {
		String s1="Code";
		String s2=new String("Code");
		String s3=s2.intern();
		System.out.println(s3==s1);
	}

}
