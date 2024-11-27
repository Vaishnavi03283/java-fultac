// Method Over-riding

class Parent{
	void education(){
		System.out.println("Engineering...");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("Engineering sodun sagl");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();		
	}
}





//OUTPUT:-   Engineering sodun sagl