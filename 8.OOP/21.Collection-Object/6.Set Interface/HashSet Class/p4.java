//HashSet Method-------->>>>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		HashSet<String> hs = new HashSet<String>();
		hs.add("viraj");
		hs.add("gumrah");
		hs.add("MS");
		hs.add("viraj");
		
		//boolean isEmpty() : this method returns true if HashSet has No elements
		System.out.println(hs.isEmpty());

		//boolean contains(object) : this method check whether the element is present in HashSet or not return type is present
		System.out.println(hs.contains("Gumrah"));

		//boolean remove(Object) : this method remove the specified element from hashSet and return true 
		System.out.println(hs.remove("gumrah"));
		System.out.println(hs);

		System.out.println(hs.size());
	}
}


/*OUTPUT:-

false
false
true
[MS, viraj]
2




*/