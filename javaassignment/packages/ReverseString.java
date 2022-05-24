package javaassignment.packages;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="India is My Country";
int i,j;
String revstr = null;
System.out.println(str);
String str1[]=str.split(" ");
//System.out.println(s);
for( i=0;i<str1.length;i++)
{
revstr=str1[i]+" "+revstr;	
}
System.out.println(revstr);
	}

}
