abstract class Car{
	abstract void design();
	void fuel(){
		System.out.println("petrol");
	}
}
class Merc extends Car{
	void design(){
		System.out.println("SUV");
	}
}
class Alto extends Car{
	void design(){
		System.out.println("Sedan");
	}
	void fuel(){
		System.out.println("Disel");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Merc features :-");
		Merc obj = new Merc();
		obj.design();
		obj.fuel();
		
		System.out.println("================================");
		System.out.println("Alto features :-");
		Alto obj1 = new Alto();
		obj1.design();
		obj1.fuel();
	}
}


/*OUTPUT:- 

Merc features :-
SUV
petrol
================================
Alto features :-
Sedan
Disel


*/





