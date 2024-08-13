package total150;

import java.util.LinkedList;

public class Seventeen {

	public static void main(String[] args) {
		// Remove a specified element from a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);
list.remove(2);//for removing second element 
		System.out.println(list);
	}

}
