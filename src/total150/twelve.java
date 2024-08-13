package total150;

import java.util.LinkedList;

public class twelve {
	//Insert the specified element at the end of a linked list

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		list.offerLast("last");
		System.out.println(list);

	}

}
