import java.util.*;

class User{
	String name;
	int phnNum;
		
	User(String name , int phnNum){
		this.name = name;
		this.phnNum = phnNum;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList <User>ls = new LinkedList <User>();
		User s = new User("Shubham",1234);
		User s1 = new User("Sanket",123);
		ls.add(s);
		ls.add(s1);

		for(User a : ls){
			System.out.println(a);
		}
	}
}



/*OUTPUT:-

User@279f2327
User@2ff4acd0

*/