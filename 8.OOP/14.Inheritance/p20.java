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


}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.property();
	}
}


/*

 error: constructor Parent in class Parent cannot be applied to given types;
class Child extends Parent{









*/