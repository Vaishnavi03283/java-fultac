class Person{
	int age;
	String name;

	//setter or mutator method for age
	void setAge(int age){
		this.age = age;
	}

	//setter or mutator method for name
	void setName(String name){
		this.name = name;
	}

	//getter or accessor method for age
	int getAge(){
		return age;
	}

	//getter or accessor method for name
	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String []args){
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Shubham");

		Person p2 = new Person();
		p2.setAge(25);
		p2.setName("Rohan");

		System.out.println("1st Person data : ");
		System.out.println(p1.getAge());
		System.out.println(p1.getName());

		System.out.println("2nd Person data : ");
		System.out.println(p2.getAge());

		p2.setName("Ram");
		System.out.println(p2.getName());		
	}
}





/*
OUTPUT:-

1st Person data :
20
Shubham
2nd Person data :
25
Ram







*/