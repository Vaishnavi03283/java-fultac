//5). element removeFirst(element)

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		System.out.println(ls.removeFirst());
		
		System.out.println(ls);
	}
}

/*OUTPUT:-	vaishu
		[Sai, Snehal]            */