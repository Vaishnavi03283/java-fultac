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
		Child obj = new Child();
		obj.property();
		obj.education();			
	}
}



/*
OUTPUT:-  Sanskar
	  Engineering 10




*/