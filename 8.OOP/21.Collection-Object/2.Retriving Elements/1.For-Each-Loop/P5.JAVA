import java.util.*;

class User{
	String name;
	int phnNum;

	User(String name ,int phnNum){
		this.name = name;
		this.phnNum = phnNum;
	}
	String getName(){
		return name;
	}
	int getPhnNum(){
		return phnNum;
	}
	
	@Override 
	public String toString(){
		return "Name is : "+name+"phnNum is : "+phnNum;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList <User>ls = new LinkedList <User>();
		User s = new User("Shubham",1234);
		User s1 = new User("Sanket",123);

		ls.add(s);
		ls.add(s1);
		
		System.out.println("All Users : ");

		for(User a : ls){
			System.out.println(a);
		}

		
		System.out.println("All Users name : ");

		for(User a : ls){
			System.out.println(a.getName());
		}

		
		System.out.println("All Users phnNum : ");

		for(User a : ls){
			System.out.println(a.getPhnNum());
		}
		
	}

}


/*OUTPUT:-

All Users :
Name is : ShubhamphnNum is : 1234
Name is : SanketphnNum is : 123
All Users name :
Shubham
Sanket
All Users phnNum :
1234
123


*/

