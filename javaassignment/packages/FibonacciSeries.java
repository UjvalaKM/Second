package javaassignment.packages;

public class FibonacciSeries {

	public static void main(String[] args) {
		int no1=0,no2=1,i,count=10,n3;
System.out.print(no1+" "+no2);
for(i=2;i<count;i++)
{
	n3=no1+no2;
	System.out.print(" "+n3);
	no1=no2;
	no2=n3;
}
	
	}

}
