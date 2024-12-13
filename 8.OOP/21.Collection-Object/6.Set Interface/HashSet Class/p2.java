//Hashset Class ----->>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		HashSet<String> hs = new HashSet<String>();
		hs.add("Viraj");
		hs.add("gumrah");
		hs.add("rohit");
		hs.add("Ms");
	
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			String s = (String)itr.next();
			System.out.println(s);
		}
	}
}

/*OUTPUT: 

Viraj
Ms
rohit
gumrah

*/
