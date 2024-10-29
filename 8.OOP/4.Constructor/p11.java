class Person{
	int age;
	String name;

	Person(){
		age = 20;
		name = "Ram";
	}

	Person(int a,String str){
		age = 21;
		name = "Sita";
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

		Person p1 = new Person(21,"Sita");
		p1.data();
	}
}


/*

age is : 20
name is : Ram
age is : 21
name is : Sita



*/