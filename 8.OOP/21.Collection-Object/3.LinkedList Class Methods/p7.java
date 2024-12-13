//7). element removeLast(element)

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		System.out.println(ls.removeLast());
		
		System.out.println(ls);
	}
}

/*OUTPUT:-	Snehal
		[vaishu, Sai]     */