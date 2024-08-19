package total150;

import java.util.ArrayList;

public class Seventyfive {

	public static void main(String[] args) {
		//Insert an element into an array
		ArrayList<Integer> ins = new ArrayList<Integer>();
		ins.add(3);
		ins.add(5);
		ins.add(4);
		System.out.println(ins);
		ins.add(1, 78);
		for(int data:ins) {
			System.out.println(data);
		}

	}

}
