import java.util.*;

class User{
	String name;
	int phnNum;

	User(String name, int phnNum){
		this.name = name;
		this.phnNum = phnNum;
	}
	String getName(){
		return name;
	}
	int getPhnNum(){
		return phnNum;
	}
	public String toString(){
		return"name is : "+name+"phnNum is : "+phnNum;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();
		User s = new User("Vaishu" , 123);
		User s1 = new User("Saiu" , 12345);

		ls.add(s);
		ls.add(s1);

		System.out.println("Using Iterator Interface : ");

		Iterator itr = ls.iterator();
		System.out.println("All Users Objects : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		itr = ls.iterator();
		System.out.println("All Users Name : ");
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getName());
		}
	}
}




/*OUTPUT:-

Using Iterator Interface :
All Users Objects :
name is : VaishuphnNum is : 123
name is : SaiuphnNum is : 12345
All Users Name :
Vaishu
Saiu








*/








