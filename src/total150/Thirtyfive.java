package total150;

import java.util.HashSet;

public class Thirtyfive {

	public static void main(String[] args) {
		//Clone a hash set to another hash set
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        System.out.println(set+"nefor cloning");
        HashSet<String> set2 =new HashSet<String>();
        set2 =(HashSet)set.clone();
        System.out.println(set2+"ater clone");
        
        		

	}

}
