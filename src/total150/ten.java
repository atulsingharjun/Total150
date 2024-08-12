package total150;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ten {

	public static void main(String[] args) {
		// Java: Iterate a linked list in reverse order.
		LinkedList<String > list = new LinkedList<String>();
		list.add("arjun");
		list.add("singh");
//		System.out.println(list);
//		LinkedList<String> l_list = new LinkedList<String>();
//		   // use add() method to add values in the linked list
//		          l_list.add("Red");
//		          l_list.add("Green");
//		          l_list.add("Black");
//		          l_list.add("Pink");
//		          l_list.add("orange");
		
		 Iterator<String> it = list.descendingIterator();

	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     

	}
	}
}
