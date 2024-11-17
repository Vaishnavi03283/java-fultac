class Parent{

	void fun(){
		System.out.println("in Parent fun");
	}
}
class Child extends Parent{

	void gun(){
		System.out.println("in Child gun");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun();
		c.gun();
		
		Parent p = new Parent();
		p.fun();
		p.gun();              //error
	
		Parent p1 = new Child();
		p1.fun();
		p1.gun();           // error
	}
}

obj var -i.e --  Child c - c is Reference Variable




