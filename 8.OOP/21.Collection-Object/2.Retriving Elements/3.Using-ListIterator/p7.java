import java.util.*;

class User{
	private String name;
	private int phnNum;

	User(String name , int phnNum){
		this.name = name;
		this.phnNum = phnNum;
	}
	String getName(){
		return name; 
	}
	int getPhnNum(){
		return phnNum;
	}
	
	public String toSring(){
		return"Name is : "+name+" phnNum is : "+phnNum;
	}	
}
class Demo{
	public static void main(String[]args){
		LinkedList<User> ls = new LinkedList<User>();
		User s1 = new User("vaishnavi",1234);
		User s2 = new User("jadhav",123);
		ls.add(s1);
		ls.add(s2);
	
		System.out.println("Forward List : ");
		ListIterator<User>itr = ls.listIterator();
		ListIterator<User>itr = ls.listIterator();

		while(itr.hasNext()){
			System.out.println(itr.next());	
		}

		System.out.println("Forward List : ");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());	
		}
	}
}

/*OUTPUT:-

Forward List :
A
B
C
Forward List :
C
B
A





*/