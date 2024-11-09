class Person{
	// Instance Variable
	int age;
	String name;
	
	// Instance Method
	void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String [] args){
		System.out.println(Person.age);
	}
}


/*

 error: non-static variable age cannot be referenced from a static context
                System.out.println(Person.age);
                                         ^

*/