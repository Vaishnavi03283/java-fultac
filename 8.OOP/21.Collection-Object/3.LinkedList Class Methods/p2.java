//1). boolean add(element)
//2). void add(integer , element);

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Saiu");
		
		ls.add(4,"Snehal");
	
		System.out.println(ls);
	
	}
}

/*RUN- TIME ---> error:- IndexOutOfBoundsException: Index: 4, Size: 2			*/