class Person{
	
	int age=20;
	String name;

	void fun(){
		System.out.println("in fun"+age);
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.fun();
	}
}


//OUTPUT:-  in fun20

