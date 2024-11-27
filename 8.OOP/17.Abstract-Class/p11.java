/*IMP--- Abstarct class code*/

abstract class Car{
	private String model;
	private String color;

	Car(String model , String color){
		this.model = model;
		this.color = color;
	}
	void fuel(){
		System.out.println("Petrol");
	}
	String getModel(){
		return model;
	}
	String getColor(){
		return color;
	}
	abstract void design();
}
class Merc extends Car{
	Merc(String model , String color){
		super(model , color);
	}
	void design(){
		System.out.println("SUV");
	}
}
class Alto extends Car{
	Alto(String model , String color){
		super(model , color);
	}
	void design(){
		System.out.println("Sedan");
	}
	void fuel(){
		System.out.println("disel");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Merc features");
		Car obj = new Merc("520","White");        //we cannot create object of Abstract class,but we can create reference of Abstract class
		System.out.println(obj.getModel());
		System.out.println(obj.getColor());
		obj.fuel();
		obj.design();

		System.out.println("================================");
		
		System.out.println("Alto features");
		Car obj1 = new Alto("k10","Black");       //we cannot create object of Abstract class,but we can create reference of Abstract class
		System.out.println(obj1.getModel());
		System.out.println(obj1.getColor());
		obj1.fuel();
		obj1.design();		
	}
}




/*OUTPUT:-

Merc features
520
White
Petrol
SUV
================================
Alto features
k10
Black
disel
Sedan





*/


























