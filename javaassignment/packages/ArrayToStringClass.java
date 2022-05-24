package javaassignment.packages;

import java.util.Arrays;

public class ArrayToStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] strArray= {"My","Name","Is","Ujvala"};
String str=convertIntoString(strArray);
	System.out.println(str);	
	}
	public static  String convertIntoString(String str[])
	{
		String str1=String.join(" ",str);
		return str1;
	}

}
