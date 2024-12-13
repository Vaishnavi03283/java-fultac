//3). void addFirst(element)

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		ls.addFirst("Jadhav");
		
		System.out.println(ls);
	}
}

//OUTPUT:-[Jadhav, vaishu, Sai, Snehal]