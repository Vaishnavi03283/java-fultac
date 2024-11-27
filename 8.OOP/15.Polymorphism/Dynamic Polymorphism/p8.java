// Dynamic polymorphism code >> using Inheritance concept

class Parent{
	void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("Engineering sodun sagla");
	}
}
class Demo{
	public static void main(String[]args){
		Parent p = new Child();
		p.education();
	}
}


//OUTPUT:- Engineering sodun sagla