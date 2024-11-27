class Parent{
	void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	public void education(){
		System.out.println("Chaha Tapri......");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
	}
}



/*OUTPUT:- Chaha Tapri......					*/