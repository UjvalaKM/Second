package operators.packages;

public class Shiftop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;//0000 0000 0000 0000 0000 0000 0000 0101
		int b=4;//0000 0000 0000 0000 0000 0000 0000 0100
		int c=a<<2;//0000 0000 0000 0000 0000 0000 000 010100//a/2^2
		System.out.println(c);
		int d=b>>2;//0000 0000 0000 0000 0000 0000 0000 0001//a*2^4
		System.out.println(d);
	}

}
