package total150;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Twentyone {

	public static void main(String[] args) {
		// Priority queue
		//Use of element, peek ,removeand poll
PriorityQueue<String >  queue =new PriorityQueue<String>();
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
//add alag order me hota hai remove priority ke hisab se jaise ki alphabatic 
//System.out.println("head:"+queue.element());  //It is used to retrieves, but does not remove, the head of this queue.
//
//System.out.println("head:"+queue.peek()); //same as above and return null if queue is empty
//Iterator itr=queue.iterator();  
//while(itr.hasNext()){  
//System.out.println(itr.next());  
//}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  

	}

}
