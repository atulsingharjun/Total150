package total150;

import java.util.PriorityQueue;

public class Twentyseven {

	public static void main(String[] args) {
		// Convert a Priority Queue elements to a string representation
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		  
		          pq1.add("Red");
		          pq1.add("Green");
		          pq1.add("Black");
		          pq1.add("White");
		    System.out.println("Original Priority Queue: "+pq1);
		   
		   //Convert Priority Queue to a string representation
		   String str1;
		   str1 = pq1.toString();
		   System.out.println("String representation of the Priority Queue: "+str1);    

	}

}
