class Person{
	int age = 20;
	String name;

	static void fun(){
		System.out.println("in fun"+ age);
	}
}

class Demo{
	public static void main(String [] args){
		Person.fun();
	}
}



/*
OUTPUT:-

 error: non-static variable age cannot be referenced from a static context
                System.out.println("in fun"+ age);



*/