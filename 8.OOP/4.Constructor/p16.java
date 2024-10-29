class Person{
	int age;
	String name;
	
	Person(int a,String str){
		 age = a;
		 name = str;
	}

	void data(){
		System.out.println("age is :  "+age);
		System.out.println("name is :  "+name);
	}
}

class Demo{
	public static void main(String [] args){
		Person p = new Person(21,"Sita");
		p.data();

		Person p1 = new Person(20,"Ram");
		p1.data();
	}
}


/*

age is :  21
name is :  Sita
age is :  20
name is :  Ram




*/