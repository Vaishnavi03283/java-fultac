//LinkedHashSet------->>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("viraj");
		hs.add("gumrah");
		hs.add("rohit");
		hs.add("MS");
		hs.add("viraj");
		
		System.out.println(hs);
	}
}


/*OUTPUT:- [viraj, gumrah, rohit, MS]


	*/