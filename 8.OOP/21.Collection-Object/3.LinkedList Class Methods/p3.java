import java.util.*;

class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		
		ls.add("vaishu");
		ls.add("Sai");
		ls.add("Snehal");
		
		ls.add(1 ,"Jadhav");
		
		System.out.println(ls);
	}
}

//OUTPUT:-[vaishu, Jadhav, Sai, Snehal]