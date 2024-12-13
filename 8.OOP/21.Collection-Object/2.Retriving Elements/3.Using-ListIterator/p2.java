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

		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}


/*OUTPUT:-

Using ListIterator :


*/