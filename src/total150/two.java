package total150;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("iterator");
		list.add("boolean has next");//check the iterator has more elements
		list.add("next");//cursor pointer to the next element 
		
		Iterator itr = list.iterator();//getting the iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
