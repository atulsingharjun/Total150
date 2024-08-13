package total150;

import java.util.LinkedList;

public class eleven {

	public static void main(String[] args) {
		//Insert elements into the linked list at the first and last position
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);

	}

}
