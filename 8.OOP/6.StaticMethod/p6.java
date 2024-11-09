class Person{
	int age =20;
	String name;

	static void fun(){
		Person p = new Person();
		System.out.println("in fun"+ p.age);
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.fun();
		Person.fun();
	}
}

/*
OUTPUT:-

in fun20
in fun20



*/