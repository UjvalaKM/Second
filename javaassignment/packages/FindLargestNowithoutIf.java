package javaassignment.packages;

public class FindLargestNowithoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20, c = 12;
		int temp;
		temp=(a>b&&a>c)?a:((b>a&&b>c)?b:c);
		System.out.println(temp);
	}

}
