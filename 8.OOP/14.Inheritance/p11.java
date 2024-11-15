class Country{
	int a = 20;

	void flag(){
		System.out.println("Tri-Color");
	}
	void language1(){
		System.out.println("Hindi");
	}
}
class Maharashtra extends Country{

	void language(){
		System.out.println("Marathi ");
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
		obj.language1();
		

		System.out.println("Goa flag & language is : ");
		Goa obj1 = new Goa();
		obj.flag();
		obj.language();
		obj.language1();

		System.out.println("Country flag & language  is : ");
		Country obj2 = new Country();
		obj.flag();
		obj.language1();
	}
}


/*

OUTPUT:-

Maharashtra flag & language is :
Tri-Color
Marathi
Hindi
Goa flag & language is :
Tri-Color
Marathi
Hindi
Country flag & language  is :
Tri-Color
Hindi


*/


