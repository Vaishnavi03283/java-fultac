class Country{
	int a = 20;

	void flag(){
		System.out.println("Tri-Color");
	}
}
class Maharashtra extends Country{

	void language(){
		System.out.println("Marathi");
	}
}
class Goa extends Country{
	
	void language(){
		System.out.println("English");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Maharashtra flag & language is : ");
		Maharashtra obj = new Maharashtra();
		obj.flag();
		obj.language();

		System.out.println("Goa flag & language is : ");
		Goa obj1 = new Goa();
		obj.flag();
		obj.language();

		System.out.println("Country flag & language  is : ");
		Country obj2 = new Country();
		obj.flag();
	}
}


/*

OUTPUT:-

Maharashtra flag & language is :
Tri-Color
Marathi
Goa flag & language is :
Tri-Color
Marathi
Country flag & language  is :
Tri-Color



*/


