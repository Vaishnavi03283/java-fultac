abstract class Parent{
	abstract void marry();
	void education(){
		System.out.println("Engineering....");
	}
}
class Child extends Parent{
	void marry(){
		System.out.println("xyz...");
	}
	void education(){
		System.out.println("doctor");
	}
}
class Child1 extends Parent{
	void marry(){
		System.out.println("x....");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.marry();
		obj.education();

		Child1 obj1 = new Child1();
		obj1.marry();
		obj1.education();
	}
}



/*OUTPUT:-

xyz...
doctor
x....
Engineering....




*/







