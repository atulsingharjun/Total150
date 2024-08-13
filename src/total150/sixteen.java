package total150;

import java.util.LinkedList;

public class sixteen {

	public static void main(String[] args) {
		//  Display the elements and their positions in a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("bamama");
		System.out.println(list);
		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);
		for(int i =0;i<list.size();i++) {
			System.out.println("index of "+i+"is"+list.get(i));
		}
		

	}

}
