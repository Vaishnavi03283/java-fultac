//Default Constructor is usefult to initiallized all object with same data

class Person{
	int age;
	String name;
	
	Person(){
		age = 21;
		name = "Ram";
	}

}

class Demo{
	public static void main(String [] args){
		Person p = new Person();
		Person p1 = new Person();	
	}

}