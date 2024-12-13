//ArrayList Class Methods---------->>>

import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Viraj");
		ls.add("gumrah");
		ls.add("rohit");

		System.out.println("Original Arraylist : ");
		System.out.println(ls);

		System.out.println();
		System.out.println();


		System.out.println(" Using Arraylist Class Methods : ");

		System.out.println();

		//boolean add(element): this method add element to arraylist and returns true if the element added successfully
		System.out.println("By -- boolean add(element)  : ");
		System.out.println(ls.add("MS"));
		System.out.println(ls);
		
		System.out.println();

		//void add(int position, element) : this method insert element at specified position.
		System.out.println("By -- void add(int position, element)  : ");
		ls.add(1,"Kohli");
		System.out.println(ls);

		System.out.println();

		//element remove(int position) : this method removes element from specified position and returns element
		System.out.println("By -- element remove(int position)  : ");
		ls.remove(1);
		System.out.println(ls);

		System.out.println();

		//int size() :  this method returns size of the arraylist
		System.out.println("By -- int size()  : ");
		System.out.println(ls.size());

		System.out.println();
		
		//element get(int position) : this method returns element at specified position in arraylist
		System.out.println("By -- element get(int position)   : ");
		String s = ls.get(1);
		System.out.println(s);
	
		System.out.println();

		//element set(int position , element) : this method update the element at specified position
		System.out.println("By -- element getset(int position , element)  : ");
		ls.set(1,"hardik pandya");
		System.out.println(ls);

		System.out.println();

		//void clear(): this method clear the all arraylist
		System.out.println("By -- void clear()  : ");
		ls.clear();
		System.out.println(ls);
	}
}


/*OUTPUT:-


Original Arraylist :
[Viraj, gumrah, rohit]


 Using Arraylist Class Methods :

By -- boolean add(element)  :
true
[Viraj, gumrah, rohit, MS]

By -- void add(int position, element)  :
[Viraj, Kohli, gumrah, rohit, MS]

By -- element remove(int position)  :
[Viraj, gumrah, rohit, MS]

By -- int size()  :
4

By -- element get(int position)   :
gumrah

By -- element getset(int position , element)  :
[Viraj, hardik pandya, rohit, MS]

By -- void clear()  :
[]



*/




