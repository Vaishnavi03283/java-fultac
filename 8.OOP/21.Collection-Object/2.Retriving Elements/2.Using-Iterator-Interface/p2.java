//# 2. Using Iterator Interface 


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
		
		System.out.println("Using Iterator Interface ");

		Iterator itr = ls.iterator();

		while(itr.hasNext()){
			User u =(User)itr.next();
			//User u =itr.next();
			System.out.println(u.getName());
			//System.out.println(itr.next().getName());
		}
	}
}


/*
OUTPUT:-

Using Iterator Interface
Shubham
Sanket



*/

