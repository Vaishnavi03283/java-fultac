//8). element getFirst()
//9). element getLast()



import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		//getFirst method returns first element in the list : element getFirst();
		System.out.println(ls.getFirst());

		//getLast method returns Last element in the list : element getLast();
		System.out.println(ls.getLast());
	
		//get method returns the element from specified position in the list : element get(int position);
		System.out.println(ls.get(1));

		System.out.println(ls);
	}
}

/*OUTPUT:-	vaishu
		Snehal
		Sai
		[vaishu, Sai, Snehal]   */