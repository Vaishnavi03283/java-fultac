import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
	
		System.out.println("Using ListIterator : ");
		ListIterator<String>itr = ls.listIterator();
		System.out.println(itr.hasPrevious());
	}
}

/*OUTPUT:-

Using ListIterator :
false





*/