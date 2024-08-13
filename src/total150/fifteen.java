package total150;

import java.util.LinkedList;

public class fifteen {
	// Get the first and last occurrence of the specified elements in a linked list
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);
		
	//	Object firstelement = list.getFirst();
		System.out.println(list.getFirst());
		
	}

}
