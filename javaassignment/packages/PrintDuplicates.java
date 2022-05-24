package javaassignment.packages;

import java.util.ArrayList;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Ujvala";
		printDuplicatesChar(str);

	}

	public static void printDuplicatesChar(String str) {
		int count = 0;
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != ch) {
					continue;
				}
				count++;
			}
 if(!charList.contains(ch))
 {
	 if(count>1&&ch!=' ')
	 {
		 System.out.println("Char: "+ch+", Count "+count+" times");
		 charList.add(ch);
		 
	 }
 }
 count=0; 
		}
	}

}
