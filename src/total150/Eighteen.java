package total150;

import java.util.Collections;
import java.util.LinkedList;

public class Eighteen {

	public static void main(String[] args) {
		//Swap two elements in a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		Collections.swap(list, 0,1);
		System.out.println(list);
		
		

	}

}
