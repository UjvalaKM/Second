package javaassignment.packages;

public class Snippet {
public static void main(String[] args) {
		int num=7;
		
		int temp;
		boolean isPrime=true;
			for(int i=2;i<=num/2;i++)
			{
			   temp=num%i;
			   if(temp==0)
			   {
			  isPrime = false;
			      break;
			   }
			}
		if(isPrime)
			   System.out.println(num + " is a Prime Number");
			else
			   System.out.println(num + " is not a Prime Number");
	
}
		

}

