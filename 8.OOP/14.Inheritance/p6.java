class Parent{
	int a = 10;

	void property(){
		System.out.println("Sanskar");
	}
}
class Child extends Parent {
	
	void education(){
		System.out.println("Engineering "+ a);
	}	
}
class Demo{
	public static void main(String[]args){
		System.out.println("Child Property is : ");
		Child obj = new Child();
		obj.property();
		obj.education();			

		System.out.println("Parent property is : ");
		obj.property();
		obj.education();
	}
}



/*
OUTPUT:- 

Child Property is :
Sanskar
Engineering 10
Parent property is :
Sanskar
Engineering 10




*/