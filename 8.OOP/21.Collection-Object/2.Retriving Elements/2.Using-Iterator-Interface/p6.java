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
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter phnNum : ");
			int phnNum = sc.nextInt();

			ls.add(new User(name, phnNum));
		}

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
		System.out.println("All Users PhnNum : ");
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getPhnNum());
		}		
	}
}





/*OUTPUT:-

Enter name:
Vaishnavi
Enter phnNum :
3114
Enter name:
Saiduu
Enter phnNum :
4118
Using Interface :
All User Object :
User Name is : Vaishnavi phnNum is : 3114
User Name is : Saiduu phnNum is : 4118
All Users name :
Vaishnavi
Saiduu
All Users PhnNum :
3114
4118




*/