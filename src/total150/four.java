package total150;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class four {

	public static void main(String[] args) {
		//Collections.Sort means sorting of array 
		List<String> list1 = new ArrayList<String>();
		list1.add("zinc");
		list1.add("jio");
		list1.add("apple");
		list1.add("ball");
		Collections.sort(list1);
		for(String listt :list1)
		System.out.println(listt);
		

	}

}
