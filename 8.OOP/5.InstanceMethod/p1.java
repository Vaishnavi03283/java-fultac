class Person{
	int age;
	String name;

	void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String [] args){
		Person.fun();
	}
}



/*

 error: non-static method fun() cannot be referenced from a static context
                Person.fun();
                      ^

*/