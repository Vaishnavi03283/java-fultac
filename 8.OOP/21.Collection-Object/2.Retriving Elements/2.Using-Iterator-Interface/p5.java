import java.util.*;

class User{
	private String name;
	private int phnNum;

	User(String ame , int phnNum){
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
		return"User Name is :  " + name + " phnNum is : "+ phnNum ;
	}
}
class Demo{
	public static void main(String[]args){
		LinkedList<User>ls = new LinkedList<User>();

		Scanner sc = new Scanner(System.in);

		System.out.println("User Objects : ");
		for(int i = 0; i<2 ; i++){
			System.out.println("Enter Name : ");
			String Name = sc.next();
			System.out.println("Enter phunum : ");
			int  phnNum = sc.nextInt();
		
			ls.add(new User(name, phnNum));             //error
		}

		Iterator itr = ls.iterator();

		System.out.println("Users data : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("Users Name : ");
		itr = ls.iterator();
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getName());
			System.out.println(itr.next());
		}

		System.out.println("Users phnNum : ");
		itr = ls.iterator();
		while(itr.hasNext()){
			User u = (User)itr.next();
			System.out.println(u.getPhnNum());
			System.out.println(itr.next());
		}
	}
}







/* error: cannot find symbol
                        ls.add(new User(name, phnNum));
                                        ^
  symbol:   variable name
  location: class Demo
*/