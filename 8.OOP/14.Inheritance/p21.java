class Parent{
	int balance;

	Parent(int balance){
		this.balance = balance;
	}

	void property(){
		System.out.println("Bank bal : "+balance);
	}
}
class Child extends Parent{
	Child(int balance){
		super(1000);
	}

}
class Demo{
	public static void main(String[]args){
		Child c = new Child(1000);
		c.property();
	}
}


/* OUTPUT:- Bank bal : 1000

*/