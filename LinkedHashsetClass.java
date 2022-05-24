import java.util.LinkedHashSet;

public class LinkedHashsetClass {

	public static void main(String[] args) {
	LinkedHashSet<Integer> data = new LinkedHashSet<Integer>();
	
	data.add(12);
	data.add(1);
	data.add(67);
	data.add(3);
	data.add(12);
	data.add(67);
	System.out.println(data.size());
	for(Integer each:data)
	{
		System.out.print(each);
	}
	}

}
