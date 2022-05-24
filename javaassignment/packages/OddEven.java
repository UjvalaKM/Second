package javaassignment.packages;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {25,42,63,74};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" Given Number is Even");
			}
			else
			{
				System.out.println(arr[i]+" Given Number is Odd");
			}
		}
		

	}

}
