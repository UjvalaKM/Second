package javaassignment.packages;

public class OccurAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABBBDFJGGDFABFJFHYDABABABABAAB";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'&&str.charAt(i+1)=='B')
			{
				count++;
			}
		}
		System.out.println("Number of Occurences of AB "+count);
		
		str="My Name is Ujvala";
		//String str1[]=str.split(" ");
	//	for(int i=0;i<str1.length;i++)
		//	System.out.println(str1[i]);
		str="AMy AName AIs AUjvala";
		String  str1[]=str.split("A");
		for(int i=0;i<str1.length;i++)
			System.out.println(str1[i]);
		System.out.println(str.indexOf("AIs"));
	
	}

}
