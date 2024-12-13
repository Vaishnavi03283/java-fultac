import java.util.*; 
class Demo{
	public static void main(String[]args){
		LinkedList <Integer>ls = new LinkedList <Integer>();
		ls.add(10);
		ls.add(20);
		
		System.out.println(ls[0]);
	}
}

/* error: array required, but LinkedList<Integer> found
                System.out.println(ls[0]);
                                     ^
*/