package total150;

import java.util.ArrayList;
import java.util.List;

public class five {

	public static void main(String[] args) {
		//Java: Insert an element into the array list at the first position
		List<String> list = new ArrayList<String>();
		list.add("arjun");
		list.add("singh");
		System.out.println(list);
		
		list.add(0, "origin");
		System.out.println(list);
	}

}
