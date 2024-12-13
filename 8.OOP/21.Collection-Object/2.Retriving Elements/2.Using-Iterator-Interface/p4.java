import java.util.*;

class User{
	private String Name;
	private int phnNum;

	User(String Name , int phnNum){
		this.Name = Name;
		this.phnNum = phnNum;
	}
	String getName(){
		return Name;
	}
	int getPhnNum(){
		return phnNum;
	}
	public String toString(){
		return"User Name is : "+Name+" phnNum is : "+phnNum;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList<User>ls = new LinkedList<User>();
		User s = new User("Vaishnu ", 1234);
		User s1 = new User("Saiduu ", 123456);

		ls.add(s);
		ls.add(s1);
		
		System.out.println("Using Interface : ");
		Iterator itr = ls.iterator();
		System.out.println("All User Object : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		itr = ls.iterator();
		System.out.println("All Users name : ");
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getName());
		}

		itr = ls.iterator();
		System.out.println("All Users name : ");
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getName());
		}		
	}
}





/*OUTPUT:-

Using Interface :
All User Object :
User Name is : Vaishnu  phnNum is : 1234
User Name is : Saiduu  phnNum is : 123456
All Users name :
Vaishnu
Saiduu
All Users name :
Vaishnu
Saiduu




*/