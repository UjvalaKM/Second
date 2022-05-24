package javaassignment.packages;

public class VowelsWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 's', 'i', 'r', 'o', 'p' };
		for (int i = 0; i < arr.length; i++) {
if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
{
	System.out.println(arr[i]+"  Alphabet is Vowel");
}
else
	System.out.println(arr[i]+" Alphabet is Consonent");

		}
	}

}
