//4). void addLast(element)

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		ls.addLast("Jadhav");
		
		System.out.println(ls);
	}
}

//OUTPUT:-[vaishu, Sai, Snehal, Jadhav]