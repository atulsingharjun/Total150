package total150;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Twentysix {

	public static void main(String[] args) {
	
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		 
		          pq1.add("Red");
		          pq1.add("Green");
		          pq1.add("Black");
		          pq1.add("White");
		    System.out.println("Original Priority Queue: "+pq1);
		   
		   //Convert a linked list to array list    
		   List<String> array_list = new ArrayList(pq1);
		   System.out.println("Array containing all of the elements in the queue: "+array_list);

	}

}
