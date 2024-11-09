class Person{
	int age;

	void fun(){
		System.out.println("in fun");
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.fun();
		System.out.println(p.age);
	}
}



/*OUTPUT:-

in fun
0


*/