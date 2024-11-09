class Person{

	//instance variable
	int age;
	String name;

	//static method
	static void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String []args){
		Person.fun();
	}
}



//OUTPUT:-  in fun