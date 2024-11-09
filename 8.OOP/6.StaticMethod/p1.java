class Person{
	int age;
	String name;

	static void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.fun();
	}
}



/*OUTPUT:-

in fun

*/