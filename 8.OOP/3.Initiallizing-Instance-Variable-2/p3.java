class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
		obj.a = 10;
		obj.name = "Vaishuu";
		

		Bank obj1 = new Bank();
		obj1.rupee();		
		obj1.a = 20;
		obj1.name = "Saiuu";

	}
}


class Codex{
	int a = 9 ;
	String name = "fundamental";

	void fun(){
		System.out.println(a);
		System.out.println(name);
	}
}

class Bank{
	int a = 30;
	String name = "Jadhav";

	void rupee(){
		System.out.println(a);
		System.out.println(name);
	}

}




/*

OUTPUT:- 

9
fundamental
30
Jadhav



*/