abstract class Parent{
	abstract void marry();
}

class Child extends Parent{
	void marry(){
		System.out.println("xyz........");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.marry();
	}
}

//OUTPUT:-xyz........