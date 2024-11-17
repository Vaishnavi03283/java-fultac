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
		System.out.println("Childs Property : ");
		Child c = new Child(1000);
		c.property();

		System.out.println("Parent Property : ");
		Parent p = new Parent(1000);
		p.property();
	}
}


/*

OUTPUT:-

Childs Property :
Bank bal : 1000
Parent Property :
Bank bal : 1000
*/