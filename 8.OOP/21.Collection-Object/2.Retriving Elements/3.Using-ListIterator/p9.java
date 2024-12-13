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

		Scanner sc = new Scanner(System.in);
		System.out.println("User Data : ");
		for(int i=0; i<2;i++){
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter phnNum : ");
			int phnNum = sc.nextInt();

			ls.add(new User(name, phnNum));
		}
	
		System.out.println("User Data List : ");
		ListIterator<User>itr = ls.listIterator();

		System.out.println("Forward List of Name : ");
		while(itr.hasNext()){
			User u =(User)itr.next();
			System.out.println(u.getName());	
		}
		
		System.out.println("Reverse List of phnNum : ");
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getPhnNum());
		}

	}
}

/*OUTPUT:-

User Data :
Enter Name :
Vaishnavi
Enter phnNum :
123
Enter Name :
Sai
Enter phnNum :
1234
User Data List :
Forward List of Name :
Vaishnavi
Sai
Reverse List of Name :
Sai
Vaishnavi





*/