package total150;

import java.util.ArrayList;
import java.util.List;

public class eight {

	public static void main(String[] args) {
		//rint all the elements of a ArrayList using the position of the elements
		List<String> list =new ArrayList();
		list.add("arjun");
		list.add("singh");
		System.out.println("original array"+list);
		int no =list.size();
		for (int index = 0; index < no; index++)
			   System.out.println(list.get(index));

	}

}
