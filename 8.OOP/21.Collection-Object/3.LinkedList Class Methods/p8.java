//7). element remove(integer)

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		ls.remove(1);
		
		System.out.println(ls);
	}
}

/*OUTPUT:-	[vaishu, Snehal]    */