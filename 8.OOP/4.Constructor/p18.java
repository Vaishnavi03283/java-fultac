class Person{
	int age;
	String name;

	Person(){
		age = 20;
		name ="Sita";
	}

	Person(int a, String str){
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
		Person p = new Person();
		p.data();

		Person p1 = new Person(21,"Ram");
		p1.data();

		Person p2 = new Person(22,"God");
		p2.data();
	}
}

/*



*/










