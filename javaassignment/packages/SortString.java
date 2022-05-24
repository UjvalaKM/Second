package javaassignment.packages;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="my nam is ujvala";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String str1=new String(ch);
		System.out.println(str1);
		

	}

}
