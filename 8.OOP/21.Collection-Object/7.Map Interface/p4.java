//Imp Code ---LinkedList>>>

import java.util.*;

class User{
	String name;
	String add;

	User(String name, String add){
		this.name = name;
		this.add = add;
	}
	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String[]args){
		LinkedList<User> ls = new LinkedList<User>();
		ls.add(new User("Vaishnavi","Pune"));
		ls.add(new User("Saiduu","Satara"));

		Iterator itr = ls.iterator();
		//System.out.println(itr.next().getName());
		System.out.println(ls.get(0).getName());
	}
}



//OUTPUT: Vaishnavi