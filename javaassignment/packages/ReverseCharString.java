package javaassignment.packages;

public class ReverseCharString {

	public static void main(String[] args) {
		String str = "India is My Country";
String s = null;
		for (int i = 0; i < str.length(); i++)
			s = str.charAt(i) + s;

		System.out.println(s);
	}

}
