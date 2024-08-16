package total150;

import java.util.HashSet;
import java.util.Iterator;

public class Twentynine {
	
	//Hasset -  best for searach ,no duplicate no null , data add acc to has code 
	//only use iteartorfarward direction
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        
        Iterator itr = set.iterator() ;
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
		
	}

}
