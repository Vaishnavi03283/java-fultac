//# 1. Using For Each loop

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList <Integer>ls = new LinkedList <Integer>();
		ls.add(10);
		ls.add(20);
		
		System.out.println(ls);

		for(Integer a : ls){
			System.out.println(a);
		}

		System.out.println(ls.size());	
	}
}


/*OUTPUT:- 

[10, 20]
10
20
2

*/