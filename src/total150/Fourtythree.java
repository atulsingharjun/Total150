package total150;

import java.util.Iterator;
import java.util.TreeSet;

public class Fourtythree {

	public static void main(String[] args) {
		// Find the numbers less than 7 in a tree set
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>small = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(1);
		   tree_num.add(2);
		   tree_num.add(3);
		   tree_num.add(5);
		   tree_num.add(6);
		   tree_num.add(7);
		   tree_num.add(8);
		   tree_num.add(9);
		   tree_num.add(10);
		     
		   // Find numbers less than 7
		 small = (TreeSet)tree_num.headSet(7);  

		   // create an iterator
		   Iterator iterator;
		   iterator = small.iterator();
		     
		   //Displaying the tre set data
		   System.out.println("Tree set data: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next());
		   }

	}

}
