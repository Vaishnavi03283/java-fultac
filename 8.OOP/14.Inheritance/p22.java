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
		Parent p = new Parent();
		p.property();
	}
}


/* error: constructor Parent in class Parent cannot be applied to given types;
                Parent p = new Parent();
                           ^
*/