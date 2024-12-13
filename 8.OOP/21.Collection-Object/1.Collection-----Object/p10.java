import java.util.*; 
class Demo{
	public static void main(String[]args){
		LinkedList <Integer> ls = new LinkedList <Integer> ();  //Integer ---generic
		ls.add(10);
		ls.add(20.5);
		ls.add(30);
		
		System.out.println(ls);
	}
}

/*error: incompatible types: double cannot be converted to Integer
                ls.add(20.5);
*/