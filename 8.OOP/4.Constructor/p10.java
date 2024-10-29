class Person{
	int age;
	String name;

	Person(){
		age = 21;
		name = "Ram";
	}

	void data(){
		System.out.println("age is :  "+age);
		System.out.println("name is :  "+name);
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.data();

		Person p1 = new Person();
		p1.data();
	}
}

/*OUTPUT:-

age is :  21
name is :  Ram
age is :  21
name is :  Ram

*/