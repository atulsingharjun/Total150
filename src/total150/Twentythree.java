package total150;

import java.util.PriorityQueue;

public class Twentythree {

	public static void main(String[] args) {
		//  Count the number of elements in a priority queue
		PriorityQueue<String> queue1 = new PriorityQueue<String>();  
		  queue1.add("Red");
		  queue1.add("Green");
		  queue1.add("Orange");
		  System.out.println(queue1);
		  PriorityQueue<String> queue2 = new PriorityQueue<String>();  
		  queue2.add("Pink");
		  queue2.add("White");
		  queue2.add("Black");
		  System.out.println("Priority Queue2: "+queue2);
		  queue1.addAll(queue2);
		  System.out.println(queue1);
		 int s1= queue1.size()
;
		  System.out.println(s1);
		  System.out.println(queue1.peek());
	}

}
