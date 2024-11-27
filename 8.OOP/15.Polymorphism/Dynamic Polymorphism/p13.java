class Parent{
	void marry(){
		System.out.println("xyz.");
	}
	void education(){
		System.out.println("Engineering..");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("x.....");
	}
}
class Child1 extends Parent{
	void education(){
		System.out.println("Engineering sodun sagl..");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Child data:- ");
		Child c = new Child();
		c.marry();
		c.education();
		
		System.out.println("Child1 data:- ");
		Child1 c1 = new Child1();
		c1.marry();
		c1.education();
	}
}



/*
OUTPUT:-

Child data:-
x.....
Engineering..
Child1 data:-
xyz.
Engineering sodun sagl..



*/




