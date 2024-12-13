import java.util.*;

class User{
	String name;
	int phnNum;

	User(String name ,int phnNum){
		this.name = name;
		this.phnNum = phnNum;
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
		
		System.out.println(ls);

		for(User a : ls){
			System.out.println(a);
		}
		
	}

}


/*OUTPUT:-

[Name is : ShubhamphnNum is : 1234, Name is : SanketphnNum is : 123]
Name is : ShubhamphnNum is : 1234
Name is : SanketphnNum is : 123

*/



/*

OUTPUT:- 

User@1f32e575
User@279f2327




*/