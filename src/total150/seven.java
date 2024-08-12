package total150;

import java.util.ArrayList;
import java.util.List;

public class seven {

	public static void main(String[] args) {
		
		//Replace the second element of a ArrayList with the specified element
		List<String> list =new ArrayList<String>();
		list.add("arjun");
		list.add("singh");
		System.out.println(list.get(1));
		list.set(1, "atul");
		System.out.println(list);
		
		

	}

}
