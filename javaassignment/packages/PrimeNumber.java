package javaassignment.packages;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num=10;
			
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
