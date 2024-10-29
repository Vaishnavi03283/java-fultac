class Person{
	int age;
	String name;

	Person(){
		age = 20;
		name = "Sita";
	}

	Person(){
		age = 21;
		name = "Ram";
	}
	
	void data(){
		System.out.println("age is : "+age);
		System.out.println("name is : "+name);
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		p.data();
	}
}


/* error: constructor Person() is already defined in class Person
        Person(){
        ^

*/