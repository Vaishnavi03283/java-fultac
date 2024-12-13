//LinkedHashSet------->>>>>

import java.util.*;

class Student{
	String name;

	Student(String name){
		this.name = name;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("viraj");
		hs.add("gumrah");
		hs.add("rohit");
		hs.add("MS");
		hs.add("viraj");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			String s =(String) itr.next();
			System.out.println(s);
		}
	}
}


/*OUTPUT:- 

viraj
gumrah
rohit
MS

	*/