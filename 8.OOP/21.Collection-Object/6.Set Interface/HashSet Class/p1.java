//Hashset Class ----->>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
	
		System.out.println(hs);
	}
}

//OUTPUT:- [20, 40, 10, 30]
