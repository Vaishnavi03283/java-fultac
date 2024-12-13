import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);

		System.out.println("Using ListIterator : ");
		ListIterator itr = ls.listIterator();
		ListIterator itr1 = ls.listIterator();

		System.out.println(itr);
		System.out.println(itr1);
		System.out.println(itr.hasPrevious());
	}
}


/*OUTPUT:-

Using ListIterator :
java.util.LinkedList$ListItr@1f32e575
java.util.LinkedList$ListItr@279f2327
false

*/