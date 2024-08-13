package total150;

import java.util.LinkedList;

public class Ninteen {

	public static void main(String[] args) {
		// Remove and return the first element of a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		System.out.println("first element  "+list.get(0));
		
		
		list.remove(0);
		System.out.println(list);

	}

}
