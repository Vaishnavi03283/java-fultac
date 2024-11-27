//Static Polymorphism

class Parent{
	static void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	static void education(){
		System.out.println("Chaha Tapri....");
	} 
}
class Demo{
	public static void main(String[]args){
		Parent obj = new Child();
		obj.education();
	}
}



//OUTPUT:- Engineering