class Person{
	int age ;
	String name ;

	Person(){
		age = 20;
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

		Person p1 = new Person();
		p1.data();		
	}
}


/*

age is : 20
name is : Ram
age is : 20
name is : Ram



*/