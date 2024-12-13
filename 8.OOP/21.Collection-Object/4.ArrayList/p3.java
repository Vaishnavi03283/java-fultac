//ArrayList Class Methods---------->>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Viraj");
		ls.add("gumrah");
		ls.add("rohit");
		System.out.println(ls);

		System.out.println(" Using Arraylist Class Methods : ");


		//boolean add(element): this method add element to arraylist and returns true if the element added successfully
		System.out.println(ls.add("MS"));
		System.out.println(ls);

		//void add(int position, element) : this method insert element at specified position.
		ls.add(1,"Kohli");
		System.out.println(ls);

		//element remove(int position) : this method removes element from specified position and returns element
		ls.remove(1);
		System.out.println(ls);

		//int size() :  this method returns size of the arraylist
		System.out.println(ls.size());
		
		//element get(int position) : this method returns element at specified position in arraylist
		String s = ls.get(1);
		System.out.println(s);

		//element set(int position , element) : this method update the element at specified position
		ls.set(1,"hardik pandya");
		System.out.println(ls);

		//void clear(): this method clear the all arraylist
		ls.clear();
		System.out.println(ls);
	}
}


/*OUTPUT:-


[Viraj, gumrah, rohit]
 Using Arraylist Class Methods :
true
[Viraj, gumrah, rohit, MS]
[Viraj, Kohli, gumrah, rohit, MS]
[Viraj, gumrah, rohit, MS]
4
gumrah
[Viraj, hardik pandya, rohit, MS]
[]


*/




